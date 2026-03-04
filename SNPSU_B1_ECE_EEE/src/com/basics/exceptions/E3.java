package com.basics.exceptions;
public class E3 {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Access Granted - Eligible.");
        }else {
            throw new RuntimeException("Access Denied - Not Eligible.");
        }
        System.out.println("User starts the app!");
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}
