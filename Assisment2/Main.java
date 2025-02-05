package Assisment2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(); 
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println("List1: " + list1);


        List<String> list2 = new LinkedList<>();
        list2.add("x");
        list2.add("y");

        list1.addAll(list2);
        System.out.println("List1 after adding List2: " + list1);
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();
         set1.add("a");
            set1.add("b");
            set1.add("c");
            System.out.println("Set1: " + set1);
            set2.add("x");
            set2.add("y");
            set1.addAll(set2);
            System.out.println("Set1 after adding Set2: " + set1);
            set3.add("1");
            set3.add("2");
            set3.add("3");
            set1.addAll(set3);
            System.out.println("Set1 after adding Set3: " + set1);


    }
}
