package com.basics.arrays.problems;
import java.util.Arrays;
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2};
        System.out.println(Arrays.toString(arr));
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i=1; i< prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println();
    }
}
