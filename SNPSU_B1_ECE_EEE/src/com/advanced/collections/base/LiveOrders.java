package com.advanced.collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        // Check order
        System.out.println("ORD101 Available? Exists? " +
                liveOrders.contains("ORD101"));
        // Check all the orders:
        System.out.println("Live Orders: " + liveOrders);
        liveOrders.remove("ORD101");
        System.out.println("ORD101 Available? Exists? " +
                liveOrders.contains("ORD101"));
        System.out.println("Live Orders: " + liveOrders);
        System.out.println("Total live orders: " + liveOrders.size());
        liveOrders.clear();
        System.out.println("Current Orders: " + liveOrders);
    }
}
