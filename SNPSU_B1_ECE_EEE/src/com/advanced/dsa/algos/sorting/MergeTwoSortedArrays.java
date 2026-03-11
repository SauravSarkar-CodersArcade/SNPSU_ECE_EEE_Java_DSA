package com.advanced.dsa.algos.sorting;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2,4,6};
        int[] b = {1,3,5,7,9};
        int[] merged = mergeTwoSortedArray(a,b);
        System.out.println(Arrays.toString(merged));
    }
    static int[] mergeTwoSortedArray(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int[] c = new int[n1+n2];
        int i=0, j=0, k=0;
        while (i < n1 && j < n2){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        // If there are remaining elements - just copy & paste
        while (i < n1){
            c[k++] = a[i++];
        }
        while (j < n2){
            c[k++] = b[j++];
        }
        return c;
    }
}
