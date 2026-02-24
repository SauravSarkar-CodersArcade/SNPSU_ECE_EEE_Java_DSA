package com.basics.conditionalStatements;
public class IfElseIfElse {
    public static void main(String[] args) {
        int x = 0;
        if( x > 0){
            System.out.println(x + " is a positive integer.");
        }else if(x < 0){
            System.out.println(x + " is a negative integer.");
        }else {
            System.out.println("The number is equal to Zero.");
        }
    }
}
