package com.advanced.dsa.dataStructures.linear.linkedLists.singly;
class LL {
    Node head; // Starting node of the list -> only access point
    private int size;
    LL(){
        size = 0; // Initially list is empty, so size is zero.
    }
    public class Node {
        String data; // The data of the node -> String type
        Node next; // The address of the next node -> Node type
        Node(String data){
            this.data = data;
            this.next = null; // Initially node is connected to null
            size++; // Increment the size as a node is created
        }
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Point the next node of new node to the head
        newNode.next = head;
        // This newNode is the new head of the list
        // Point the head to this new node
        head = newNode;
    }
    public void addLast(String data){
        // Create a new node
        Node newNode = new Node(data);
        // If the list is empty - head will point to null
        if (head == null){
            head = newNode; // The newNode becomes the head of the list
            return;
        }
        // For multiple elements - we need to find the last(tail) node
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        // After this loop is over we will be standing @ last node
        // Point the last node next to the newNode
        last.next = newNode;
    }
    public void removeFirst(){
        // Empty list -> Give a message to user & return to main
        if (head == null){
            System.out.println("Empty List. Can't remove head.");
            return;
        }
        // Single element or multiple elements
        // For a single element -> if deleted -> head becomes null
        // For multiple elements -> if deleted -> head is the next node
        head = this.head.next;
        size--; // reduce the size by one node
    }
    public void removeLast(){
        // Empty list -> Give a message to user & return to main
        if (head == null){
            System.out.println("Empty List. Can't remove tail.");
            return;
        }
        // Single element
        if (head.next == null){
            head = null;
            size--; // One node deleted
            return;
        }
        // For multiple elements we need to find the secondLast & last
        // We use a two pointer approach
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null){
            secondLast = last;
            last = last.next;
        }
        // After this loop is over, we will be at the correct
        // second last & last nodes respectively
        secondLast.next = null;
        // The last node will be cleared by the JVM
        size--;
    }
    public void deleteTargetNode(String target) {
        // Empty list -> Give a message to user & return to main
        if (head == null) {
            System.out.println("Empty List. Can't remove target.");
            return;
        }
        // Case where head is the target node
        if (head.data.equals(target)) {
            head = head.next; // Move the head to the next node
            size--;
            return;
        }
        // Case where the target is anywhere else in the list
        // Two Pointer Approach
        Node prev = null;
        Node curr = head;
        while (curr != null && !curr.data.equals(target)) {
            prev = curr;
            curr = curr.next;
        }
        // Check for null -> Then we pass a message -> target not found
        if (curr == null) {
            System.out.println("Target: " + target + " not found in the list");
        }
        // If found, make adjustments to the nodes & pointers
        prev.next = curr.next;
        size--;
    }
    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("ECE");
        sll.addFirst("&");
        sll.addFirst("EEE");
        sll.addFirst("Semester");
        sll.addFirst("6th");
        sll.addFirst("is");
        sll.addFirst("This");
        sll.printList();
        sll.addLast("Java");
        sll.addLast("DSA");
        sll.addLast("Training");
        sll.addLast("By Tripillar Solutions");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.deleteTargetNode("DSA");
        sll.printList();
    }
}

