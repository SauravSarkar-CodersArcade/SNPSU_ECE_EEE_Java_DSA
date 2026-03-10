package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        // Base case // Edge case // Corner case
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                // Move to the right
                s = mid + 1;
            }else {
                // Move to the left
                e = mid -1;
            }
        }
        return -1; // return an invalid index for no key found
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,56,78};
        int key = 14;
        int index = binarySearch(arr,key);
        if (index == -1){
            System.out.println(key + " is not present in the array: "
                    + Arrays.toString(arr));
        }else {
            System.out.println(key + " is present at index " + index +
                    " in the array: " + Arrays.toString(arr));
        }
    }
}
