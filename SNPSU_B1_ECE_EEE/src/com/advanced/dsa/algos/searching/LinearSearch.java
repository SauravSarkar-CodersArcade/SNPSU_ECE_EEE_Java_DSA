package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i; // Return the index where the key is present
            }
        }
        // If you don't find the key, return an invalid index
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9,2,-1,4,6,7,3,8};
        int key = 600;
        int index = linearSearch(arr,key);
        if (index == -1){
            System.out.println(key + " is not present in the array: "
            + Arrays.toString(arr));
        }else {
            System.out.println(key + " is present at index " + index +
                    " in the array: " + Arrays.toString(arr));
        }
    }
}
