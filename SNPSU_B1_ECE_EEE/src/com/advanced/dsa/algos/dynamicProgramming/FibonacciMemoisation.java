package com.advanced.dsa.algos.dynamicProgramming;
import java.util.Arrays;
public class FibonacciMemoisation {
    public static int fib(int n, int[] dp){
        if (n <= 1) return n;
        // Step 2: If you have the value, don't calculate, just return it
        if (dp[n] != -1){
            return dp[n];
        }
        // Step 3: If you don't have the value calculate it
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 6;
        // Step 1: Initially we will take a DP array of -1 values
        int[] dp = new int[n+1]; // The starting fibonacci number is 0
        Arrays.fill(dp, -1); // Fil with default values -1
        System.out.println("The fibonacci of " + n + "th is: " +
                fib(n, dp));
    }
}
