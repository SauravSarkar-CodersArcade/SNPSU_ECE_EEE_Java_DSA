package com.basics.loopingStatements;
public class Problem1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(++a + ++b);
        for (int i=1; i<5; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=1; i<5; ++i){
            System.out.print(i + " ");
        }
    }
}
