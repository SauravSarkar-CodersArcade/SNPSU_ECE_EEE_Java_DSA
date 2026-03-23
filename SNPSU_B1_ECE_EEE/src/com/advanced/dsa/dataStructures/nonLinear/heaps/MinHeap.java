package com.advanced.dsa.dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
public class MinHeap {
    public static void main(String[] args) {
        // 8,6,4,2,1,9,7,5
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(8);
        minHeap.add(6);
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(1);
        minHeap.add(9);
        minHeap.add(7);
        minHeap.add(5);
        System.out.println(minHeap);
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
    }
}
