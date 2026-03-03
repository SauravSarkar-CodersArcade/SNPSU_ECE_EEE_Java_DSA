package com.basics.garbageCollection;
public class GCExample {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Python");
        s1 = s2;
        // System.gc(); // We wrote this in previous versions
        // Now it is not mandatory
        // Now, int the SCP -> "Java" is not available
        // This proves that Garbage Collection is Automatic
        // Any unused data is cleared = Garbage Collection
        System.out.println(s1);
    }
}
