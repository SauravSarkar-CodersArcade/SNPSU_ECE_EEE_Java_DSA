package com.advanced.dsa.dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
import java.util.Queue;
public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity = new PriorityQueue<>();
        // 1 -> High Priority
        // 5 -> Low Priority
        // 3 -> Medium Priority
        // Patient with higher priority shall be operated first
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("Patient that gets operated first: "
        + severity.poll());
        System.out.println("Patients in queue: " +
                severity);
    }
}
