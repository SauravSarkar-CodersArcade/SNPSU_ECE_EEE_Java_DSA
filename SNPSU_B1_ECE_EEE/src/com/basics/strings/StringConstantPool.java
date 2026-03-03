package com.basics.strings;
public class StringConstantPool {
    public static void main(String[] args) {
        // They have the same literal value "Java"
        // So they point to the same object in Heap
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2); // Compares Objects
        String s3 = new String("Java");
        System.out.println(s1 == s3); // They are different objects
        System.out.println(s1.equals(s3)); // Checking values
    }
}
