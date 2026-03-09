package com.basics.arrays;
public class E1 {
    public static void main(String[] args) {
        // Method 1
        int[] arr; // Declaration
        arr = new int[5]; // Memory Allocation [20 Bytes] [4bytes x 5 blocks]
        System.out.println(arr[4]);
        // If we do not provide any values,
        // the JVM uses "FALLBACK MECHANISM"
        // It uses the default values of that particular data type
        // int->0, float->0.0, String->null, boolean->false, char->null
        // Declaration & Memory Allocation in single line
        // Method 2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        // Method 3
        int[] arr3 = {2,8,-1,4,6}; // Assigning custom values
        System.out.println(arr3[3]);
        // Method 4
        int[] arr4 = new int[]{8,0,4,1,3};
        System.out.println(arr4[0]);
    }
}
