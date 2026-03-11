package com.basics.methods.recursion;
public class FibonacciSequence {
    public static int fibonacci(int n){
        // Base Case:
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
