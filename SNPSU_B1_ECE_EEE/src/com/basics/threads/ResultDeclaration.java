package com.basics.threads;
public class ResultDeclaration{
    synchronized void declareResult() throws Exception {
        System.out.println("Admin waiting for approval...");
        wait();
        System.out.println("Exam Results Declared....!");
    }
    synchronized void approve(){
        notify();
    }
    public static void main(String[] args) throws Exception{
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(() -> {
            try {
                rd.declareResult();
            }catch (Exception e){}
        }).start();
        Thread.sleep(2000);
        new Thread(() -> rd.approve()).start();
    }
}
