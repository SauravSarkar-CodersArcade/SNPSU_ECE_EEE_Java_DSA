package com.basics.threads;
public class FoodOrder extends Thread {
    String task;
    FoodOrder(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " started.");
    }
    public static void main(String[] args) {
        // Threads allow Parallel Execution
        FoodOrder cooking = new FoodOrder("Cooking");
        FoodOrder packing = new FoodOrder("Packing");
        FoodOrder delivery = new FoodOrder("Assigning Delivery Agent");
        cooking.start();
        packing.start();
        delivery.start();
    }
}
/*
⭐ Extend Thread
⭐ Override run()
⭐ Use start()
⭐ Less flexible due to inheritance limitations
 */
