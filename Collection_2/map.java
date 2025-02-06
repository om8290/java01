package Collection_2;

import java.util.HashMap;
import java.util.Map;

public class map {
     public static void main(String[] args) {
    
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "om");
        map.put(2, "sunny");
        map.put(3, "ravi");

    
        System.out.println("Value for key 2: " + map.get(2)); 

       
        System.out.println("\nIterating over Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
