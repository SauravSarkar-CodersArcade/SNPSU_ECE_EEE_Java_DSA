package com.advanced.dsa.algos.dynamicProgramming;
public class FibonacciSpaceOptimization {
    public static int fib(int n){
        // Base Case
        if(n <= 1) return n;
        int p2 = 0;
        int p1 = 1;
        for (int i=2; i<=n; i++){
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("The fibonacci of " + n + "th is: " +
                fib(n));
    }
}
