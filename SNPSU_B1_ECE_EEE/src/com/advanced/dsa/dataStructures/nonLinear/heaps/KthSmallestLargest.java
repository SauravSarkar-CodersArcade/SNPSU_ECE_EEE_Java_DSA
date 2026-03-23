package com.advanced.dsa.dataStructures.nonLinear.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestLargest {
    public static int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new 
                PriorityQueue<>(Collections.reverseOrder());
        for (int x : arr){
            maxHeap.add(x);
            if (maxHeap.size() > k){
                maxHeap.poll(); // Remove extra elements > k size
            }
        }
        return maxHeap.peek();
    }
    public static int kthLargest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int x : arr){
            minHeap.add(x);
            if (minHeap.size() > k){
                minHeap.poll(); // Remove extra elements > k size
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 3;
        System.out.println(kthSmallest(arr,k)); // 3
        System.out.println(kthLargest(arr,k)); // 4
    }
}
