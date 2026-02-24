package com.basics;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("Byte Range: " +
                Byte.MIN_VALUE + " to " +
                Byte.MAX_VALUE);
        System.out.println("Short Range: " +
                Short.MIN_VALUE + " to " +
                Short.MAX_VALUE);
        System.out.println("Int Range: " +
                Integer.MIN_VALUE + " to " +
                Integer.MAX_VALUE);
        System.out.println("Long Range: " +
                Long.MIN_VALUE + " to " +
                Long.MAX_VALUE);
        System.out.println("Float Range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE);
        System.out.println("Double Range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE);
        System.out.println("Char Range: " +
                (int) Character.MIN_VALUE + " to " +
                (int) Character.MAX_VALUE);
        System.out.println("Boolean has no range, " +
                "it is just true & false");
    }
}
