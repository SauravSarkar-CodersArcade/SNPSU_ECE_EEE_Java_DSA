package com.basics.arrays.problems;

import java.util.Arrays;

public class MaxElementAndMinElement {
    public static void main(String[] args) {
        int[] array = {23, 0, -2, 41, 100, 98, 6};
        int mx = array[0]; // We assume the first to be max
        int mn = array[0]; // We assume the first to be min
        for (int i=1; i< array.length; i++){
            if(array[i] > mx){
                mx = array[i];
            }
            if(array[i] < mn){
                mn = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max: " + mx);
        System.out.println("Min: " + mn);
    }
}
