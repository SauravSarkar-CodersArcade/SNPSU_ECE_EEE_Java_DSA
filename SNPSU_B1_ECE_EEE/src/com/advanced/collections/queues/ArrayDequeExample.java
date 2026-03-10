package com.advanced.collections.queues;
import java.util.ArrayDeque;
import java.util.Deque;
// Undo - Redo Operations
public class ArrayDequeExample {
    public static void main(String[] args) {
        // Double - ended queue
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("User types A");
        actions.addLast("User types B");
        actions.addLast("User deletes B");
        System.out.println("Initial actions: " + actions);
        System.out.println("Undo action: " + actions.removeLast());
        System.out.println("Remaining Actions: " +
                actions);
    }
}
