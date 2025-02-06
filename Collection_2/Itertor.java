package Collection_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Itertor {
        public static void main(String[] args) {   
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
             System.out.println("🔹 Using Iterator:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }       
        System.out.println("\n🔹 Using for-each loop:");
        for (Integer i : list) {
            System.out.println(i);
        }       
        System.out.println("\n🔹 Using forEach() method:");
        list.forEach(i -> System.out.println(i));        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("\n🔹 Using entrySet() with for-each loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
