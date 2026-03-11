package com.basics.methods.recursion;
public class Factorial {
    public static int factorial(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(-29));
    }
}
