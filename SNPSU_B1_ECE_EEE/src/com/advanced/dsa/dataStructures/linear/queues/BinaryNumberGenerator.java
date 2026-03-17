package com.advanced.dsa.dataStructures.linear.queues;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumberGenerator {
    public static void generateBinary1ToN(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (N-- > 0){
            String curr = q.poll(); // Pop
            System.out.print(curr + " "); // Print
            q.offer(curr + "0"); // Concatenate 0 & push to queue
            q.offer(curr + "1"); // Concatenate 1 & push to queue
        }
        System.out.println(); // offer = add(push) , poll = remove(pop)
    }
    public static void main(String[] args) {
        int N = 5;
        generateBinary1ToN(N);
        generateBinary1ToN(6);
        generateBinary1ToN(10);
    }
}
