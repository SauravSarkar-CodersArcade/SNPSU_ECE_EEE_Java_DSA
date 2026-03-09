package com.basics.arrays.problems;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int n = arr.length + 1;
        int totalSum = n * (n+1) / 2;
        int arraySum = 0;
        for (int num : arr){
            arraySum += num;
        }
        System.out.println("Array Sum: " + arraySum);
        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number: " + missingNumber);
    }
}
