package com.advanced.dsa.dataStructures.linear.queues;
public class SlidingWindowProblem {
    public static void main(String[] args) {
        /*
        Total Windows Formula : n - k +1 -> 8 - 3 + 1 = 5 + 1 = 6
        Total Windows = Total Length - Window Size + 1
         */
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        for (int i=0; i<=arr.length - k; i++){ // 0 to 8-3 = 5 (0-5) 6 win
            int max = arr[i];
            for (int j = i; j<i+k; j++){
                if (arr[j] > max){
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
