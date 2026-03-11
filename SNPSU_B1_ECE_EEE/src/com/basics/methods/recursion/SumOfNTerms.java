package com.basics.methods.recursion;
public class SumOfNTerms {
    public static int sum(int n){
        // Base Case : if n == 0 -> just return 0
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(100));
        System.out.println(sum(5));
    }
}
