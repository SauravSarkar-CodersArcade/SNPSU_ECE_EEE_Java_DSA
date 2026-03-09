package com.basics.arrays;
// Varargs -> ... for an array {It internally uses arrays}
public class E7 {
    public static void display(int... arr){
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {0,9,1,4,7,8};
        display(array);
    }
}
