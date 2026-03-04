package com.basics.exceptions;
public class E4 {
    static void withdraw(int tb, int amt){
        final int mb = 2000;
        if(tb - amt < mb){ // 6000 - 3000 = 3000 > 2000 {Safe}
            throw new RuntimeException
                    ("Minimum balance of 2000 must be maintained!");
        }
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: " +
                (tb - amt));
    }
    public static void main(String[] args) {
        withdraw(6000, 3000);
        withdraw(5000, 4000);
    }
}
