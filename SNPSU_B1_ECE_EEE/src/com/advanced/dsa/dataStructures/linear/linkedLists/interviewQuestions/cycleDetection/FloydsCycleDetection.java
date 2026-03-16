package com.advanced.dsa.dataStructures.linear.linkedLists.interviewQuestions.cycleDetection;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class FloydsCycleDetection {
    static Node head;
    static void createList(){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next.next = null; // 4 --> null (No Cycle)
        head.next.next.next.next = head.next; // 4 --> 2  (Cycle)
    }
    static boolean hasCycle(){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next; // Move 1 step
            fast = fast.next.next; // Move 2 steps
            if (slow == fast){ // If slow & fast meet -> Cycle exists
                return true;
            }
        }
        return false; // if loop ends & they don't meet -> No cycle
    }
    public static void main(String[] args) {
        createList();
        System.out.println(hasCycle() ? "Cycle Detected" : "No Cycle");
    }
}
