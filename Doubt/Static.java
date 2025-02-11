package Doubt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Static {
    static int x = 10;
    int y = 20;

 public static void main(String[] args) {
        // Static s1 = new Static();
        // Static s2 = new Static();
        // s1.x = 30;
        // s1.y = 40;
        // System.out.println(s1.x + " " + s1.y);
        // System.out.println(s2.x + " " + s2.y);
        //  try{    }
        //   finally{
        //     System.out.println("this is working");
        //   }
        String s1 = " my name is om ";
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            if (currentChar != ' ') {
                mp.put(currentChar, mp.getOrDefault(currentChar, 0) + 1);
            }
        }
         System.out.println(mp);

          ArrayList <Integer> arr = new ArrayList<>();
          arr.add(31);
          arr.add(32);
          arr.add(53);
          arr.add(42);
           HashSet<Integer> hash= new HashSet<>();
            hash.add(51);
            hash.add(42);
            hash.add(33);
            hash.add(27);
            hash.add(17);
             System.out.println(arr);
             System.out.println(hash);
            



 }
}
 
