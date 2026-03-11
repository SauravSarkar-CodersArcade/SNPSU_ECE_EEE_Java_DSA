package com.advanced.collections.maps;
import java.util.Hashtable;
public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Anushree");
        ht.put(117, "Naveen");
        ht.put(128, "Meghana");
        ht.put(102, "Punith");
        ht.put(100, "Sinchana");
        ht.put(99, "Kavana");
        ht.put(98, "SheethalGowda");
        System.out.println(ht.getOrDefault(99, "Not Found"));
        System.out.println(ht.getOrDefault(101, "Not Found"));
        ht.putIfAbsent(90, "Akash");
        System.out.println("Updated Table: " + ht);
        ht.putIfAbsent(102, "Saurav"); // It won't update
        System.out.println("Updated Table: " + ht);

    }
}
