package com.advanced.collections.maps;
import java.util.Hashtable;
import java.util.Map;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Anushree");
        ht.put(117, "Naveen");
        ht.put(128, "Meghana");
        ht.put(102, "Punith");
        ht.put(100, "Sinchana");
        ht.put(99, "Kavana");
        ht.put(98, "SheethalGowda");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + "<->" + entry.getValue());
        }
    }
}
