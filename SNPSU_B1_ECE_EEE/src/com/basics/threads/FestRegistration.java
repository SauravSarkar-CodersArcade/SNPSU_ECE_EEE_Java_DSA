package com.basics.threads;
public class FestRegistration {
    // Form Fill-up
    static class FormFilling extends Thread{
        public void run(){
            System.out.println("Form Filling Started.");
        }
    }
    // Upload Documents
    static class DocumentsUpload extends Thread{
        public void run(){
            System.out.println("Document Upload Started.");
        }
    }
    // Email Notification
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Email Notification Sent.");
        }
    }
    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
ℹ   Points to remember:
⭐ Java Program starts with one main thread
⭐ Threads allow "parallel execution" -> Concurrency
⭐ Output order is never guaranteed
⭐ Threads share the same memory
⭐ Improves the performance & responsiveness
⭐ When start() is called, the JVM creates a new Thread
⭐ When run() is called directly, there is no concurrency
ℹ   Process vs Thread
⭐ Process is a running program
⭐ Thread is a path of execution inside the program
⭐ A process has its own memory
⭐ Threads share the same memory
⭐ Creating a Thread is cheaper than creating a Process
🟢 Examples:
⭐ Process -> Google Chrome Browser; Thread -> New Tab of Chrome
⭐ Closing a tab will not close Chrome or will not kill Chrome  ️
 */
