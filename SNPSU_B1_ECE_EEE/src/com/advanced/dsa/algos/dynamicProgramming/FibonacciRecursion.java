package com.advanced.dsa.algos.dynamicProgramming;
// Time Complexity & Space Complexity are large (Recursion)(Stack)(0(n))
public class FibonacciRecursion {
    public static int fib(int n){
        if (n <= 1) return n; // 0 for 0 or 1 for 1
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println("The fibonacci of " + n + "th is: " +
                fib(n));
    }
}
