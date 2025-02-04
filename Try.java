
    import java.io.*;

class InvalidDataFormatException extends Exception {
    public InvalidDataFormatException(String message) {
        super(message);
    }
}

public class Try {
    public static void main(String[] args) {
        String filePath = "config.txt"; // Assume this file contains key-value pairs

        try {
            readConfigFile(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Error: Configuration file not found - " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Error: Null value encountered in configuration - " + e.getMessage());
        } catch (InvalidDataFormatException e) {
            System.err.println("Error: Invalid data format - " + e.getMessage());
        }
    }

    public static void readConfigFile(String filePath) throws FileNotFoundException, InvalidDataFormatException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("The file " + filePath + " does not exist.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.contains("=")) {
                    throw new InvalidDataFormatException("Line does not contain '=': " + line);
                }

                String[] parts = line.split("=");
                if (parts.length != 2 || parts[0].trim().isEmpty() || parts[1].trim().isEmpty()) {
                    throw new InvalidDataFormatException("Invalid key-value pair: " + line);
                }

                String key = parts[0].trim();
                String value = parts[1].trim();

                // Simulating a NullPointerException if a value is explicitly set to "null"
                if ("null".equalsIgnoreCase(value)) {
                    throw new NullPointerException("Value for key '" + key + "' is null.");
                }

                System.out.println("Config Key: " + key + ", Value: " + value);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}


