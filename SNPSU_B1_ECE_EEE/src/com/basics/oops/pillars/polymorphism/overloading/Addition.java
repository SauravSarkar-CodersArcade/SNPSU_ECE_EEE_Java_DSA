package com.basics.oops.pillars.polymorphism.overloading;
public class Addition {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(float a, float b){
        System.out.println(a+b);
        System.out.println("Float");
    }
    static void add(double a, double b){
        System.out.println(a+b);
        System.out.println("Double");
    }
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1.25f, 2.45F);
        add(2.6789, 4.5632);
    }
}
