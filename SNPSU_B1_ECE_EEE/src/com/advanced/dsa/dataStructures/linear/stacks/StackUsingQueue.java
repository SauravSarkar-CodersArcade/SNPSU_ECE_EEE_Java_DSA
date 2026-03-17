package com.advanced.dsa.dataStructures.linear.stacks;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x){
        q2.add(x); // Any new element should be added to the q2
        while (!q1.isEmpty()){
            q2.add(q1.remove()); // Move all elements q1 to q2
        }
        // Swap q1 & q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    int pop(){
        return q1.remove();
    }
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}
