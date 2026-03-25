package com.advanced.dsa.algos.dynamicProgramming;
public class FibonacciTabulation {
    public static int fib(int n){
        // TC O(n) For loop + SC O(n) dp array of size [n+1]
        if (n <= 1) return n;
        // Step 1: Create a DP array of size n + 1 (Starts with 0)
        int[] dp = new int[n+1];
        // Step 2: Store the known values [Tabulation]
        dp[0] = 0;
        dp[1] = 1;
        // Step 3: Calculate the unknown value [2 to n]
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("The fibonacci of " + n + "th is: " +
                fib(n));
    }
}
