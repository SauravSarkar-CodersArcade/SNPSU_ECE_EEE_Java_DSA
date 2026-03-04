package com.basics.threads;
public class SleepExample {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Printing Numbers 1 to 5:");
        for (int i=1; i<=5; i++){
            System.out.println("Printing Number: " + i);
            Thread.sleep(2000);
        }
        System.out.println("Successfully Printed 1 to 5");
    }
}
/*
ℹ Code Explanation:
⭐ Here, the thread is paused for a fixed duration using sleep()
⭐ The thread does not release any lock, and it resumes automatically
   after the given time.
⭐ It will just interrupt the execution of the thread for that time
 */
