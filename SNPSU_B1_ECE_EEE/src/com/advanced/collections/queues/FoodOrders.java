package com.advanced.collections.queues;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        // For adding elements [add][strict] [offer][lenient]
        orders.add("Order101");
        orders.offer("Order102");
        orders.offer("Order103");
        System.out.println("Orders: " + orders);
        // For removing elements [remove][strict] [poll][lenient]
        orders.remove();
        System.out.println("Orders: " + orders);
        orders.poll();
        System.out.println("Orders: " + orders);
    }
}
