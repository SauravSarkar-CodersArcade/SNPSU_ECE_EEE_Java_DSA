package com.basics.threads;
public class TicketTask implements Runnable {
    String task;
    TicketTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " in progress.");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(
             new TicketTask("Seat Allocation"));
        Thread t2 = new Thread(
             new TicketTask("Payment Processing"));
        Thread t3 = new Thread(
             new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
⭐ Implements Runnable Interface
⭐ Better Design
⭐ Preferred by interviewers
⭐ Supports multiple inheritance via interfaces
 */
