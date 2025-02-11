package JAVA8;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class MAin{
    public static void main(String[] args) throws IOException {
        // Directory containing log files
        Path logDir = Paths.get("logs");
        // List all log files in the directory
        List<Path> logFiles = Files.list(logDir)
                                   .filter(Files::isRegularFile)
                                   .collect(Collectors.toList());

        // Process each log file asynchronously
        List<CompletableFuture<Long>> futures = logFiles.stream()
            .map(filePath -> CompletableFuture.supplyAsync(() -> processLogFile(filePath)))
            .collect(Collectors.toList());

        // Wait for all files to be processed and calculate total processing time
        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
        allOf.thenRun(() -> {
            long totalProcessingTime = futures.stream()
                .mapToLong(CompletableFuture::join)
                .sum();
            System.out.println("Total processing time: " + totalProcessingTime + " ms");
        }).join();
    }

    private static long processLogFile(Path filePath) {
        long startTime = System.currentTimeMillis();
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(filePath);
            // Filter lines containing "ERROR"
            List<String> errorLines = lines.stream()
                                           .filter(line -> line.contains("ERROR"))
                                           .collect(Collectors.toList());
            // Write filtered lines to a new file
            Path outputFilePath = Paths.get("processed_" + filePath.getFileName());
            Files.write(outputFilePath, errorLines);
            long duration = System.currentTimeMillis() - startTime;
            System.out.println("Processed " + filePath.getFileName() + " in " + duration + " ms");
            return duration;
        } catch (IOException e) {
            throw new RuntimeException("Error processing file: " + filePath, e);
        }
    }
}
