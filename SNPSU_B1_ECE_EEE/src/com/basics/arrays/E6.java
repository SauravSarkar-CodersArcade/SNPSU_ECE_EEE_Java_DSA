package com.basics.arrays;
import java.util.Arrays;
public class E6 {
    public static void main(String[] args) {
        // Some special array methods;
        int[] arr = {100, 200, 300, 400, 500};
        // Converts the content into a String & prints them in one line
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[arr.length]; // 0 0 0 0 0
        System.out.println(Arrays.toString(arr2));
        // Copy the contents of one array into another
        // Method 1 -> Taking a traditional for loop
        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[i]; // dest[i] = src[i]
        }
        System.out.println(Arrays.toString(arr2));
        // Method 2 -> by using arraycopy(5 arguments)
        int[] arr3 = new int[arr2.length]; // 0 0 0 0 0
        // src, srcPos, dest, destPos, length
        System.arraycopy(arr2, 0, arr3, 0, arr2.length);
        System.out.println(Arrays.toString(arr3));
        // Method 3 -> by using a clone() method
        int[] arr4 = arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}
