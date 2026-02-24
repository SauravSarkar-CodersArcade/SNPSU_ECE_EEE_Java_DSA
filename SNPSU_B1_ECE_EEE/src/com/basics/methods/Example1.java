package com.basics.methods;
public class Example1 {
    // To access methods without objects, we use static
    static int x = 10;
    static void add(int a, int b){ // Method Definition
        // a, b -> Parameters
        // The variables in a method are called parameters
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        // Example1 obj = new Example1(); // heap memory
        add(1,2); // Method Call -> 1,2 (Arguments)
        // The actual values passed during method
        // call are arguments
        System.out.println(x);
    }
}
