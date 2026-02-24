package com.basics.conditionalStatements;
import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        if((n & (n-1)) == 0){
            System.out.println(n + " is a power of 2");
        }else {
            System.out.println(n + " is not a power of 2");
        }
    }
}
