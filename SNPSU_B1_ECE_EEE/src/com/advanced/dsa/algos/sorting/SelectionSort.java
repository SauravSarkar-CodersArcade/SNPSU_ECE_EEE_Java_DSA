package com.advanced.dsa.algos.sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){ // What we thought to be min is wrong
                // Swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {100,3,200,4,-2,5,8,10,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
