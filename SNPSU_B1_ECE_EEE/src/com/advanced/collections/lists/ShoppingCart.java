package com.advanced.collections.lists;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("M5-Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        // Mouse no longer needed
        cart.remove("Mouse"); // it is case-sensitive
        System.out.println("Latest cart after removal: " + cart);
        cart.set(1, "Mechanical Keyboard");
        System.out.println("Latest Cart after update: " + cart);
    }
}
