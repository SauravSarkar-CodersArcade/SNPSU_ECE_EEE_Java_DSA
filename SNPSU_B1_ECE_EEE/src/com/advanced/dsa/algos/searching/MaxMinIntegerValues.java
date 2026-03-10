package com.advanced.dsa.algos.searching;
public class MaxMinIntegerValues {
    public static void main(String[] args) {
        System.out.println("Max Integer Value: " + Integer.MAX_VALUE);
        System.out.println("Min Integer Value: " + Integer.MIN_VALUE);
        System.out.println("MaxInteger + 1: " + (Integer.MAX_VALUE + 1));
        System.out.println("MinInteger - 1: " + (Integer.MIN_VALUE - 1));
        /*
        s = max_value
        e = max_value + 1
        mid = (s+e)/2 = (-)ve {Out Of Bounds}
        mid = s + (e-s)/2;
         */
    }
}
