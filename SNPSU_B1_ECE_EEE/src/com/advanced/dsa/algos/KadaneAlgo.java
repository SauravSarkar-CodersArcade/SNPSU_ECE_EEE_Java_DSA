package com.advanced.dsa.algos;
public class KadaneAlgo {
    static int kadaneAlgo(int[] arr){
        int gMax = arr[0];
        int cMax = arr[0];
        for (int i=1; i<arr.length; i++){
            cMax = Math.max(arr[i], cMax + arr[i]);
            gMax = Math.max(cMax, gMax);
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        System.out.println("Maximum Sub-array Sum: " + kadaneAlgo(arr));
        int[] data = {-1,-2,-3,-4,-5,-6,0};
        System.out.println(kadaneAlgo(data));
    }
}
