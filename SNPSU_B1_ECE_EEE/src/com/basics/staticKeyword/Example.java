package com.basics.staticKeyword;
public class Example {
    // Static belongs to the Stack Memory.
    // No objects are needed for it.
    // The static block executes with the class before main()
    static int x = 2;
    static {
        System.out.println("Open the system.");
    }
    public static void main(String[] args) {
        System.out.println("SNPSU-ECE-EEE-2027");
        System.out.println(x);
    }
    static {
        System.out.println("Start the app.");
        System.out.println("DB.start()");
        System.out.println("Internet.start()");
        System.out.println("Files.open()");
    }
}
