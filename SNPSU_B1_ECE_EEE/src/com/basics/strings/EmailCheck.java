package com.basics.strings;
public class EmailCheck {
    public static void main(String[] args) {
        String email1 = "student@gmail.com";
        String email2 = "worker1_edu";
        if (email1.contains("@") && email1.endsWith(".com")){
            System.out.println("Valid Email");
        }else {
            System.out.println("Invalid Email");
        }
        if (email2.contains("@") && email1.endsWith(".com")){
            System.out.println("Valid Email");
        }else {
            System.out.println("Invalid Email");
        }
        String USN = "1SG23EE087";
        System.out.println(USN.startsWith("1SG")); // True
        System.out.println(USN.startsWith("SG")); // False
    }
}
