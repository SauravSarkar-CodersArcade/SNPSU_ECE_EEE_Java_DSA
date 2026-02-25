package com.basics.patterns;
public class Pyramid {
    static void printPyramid(int n){
        for (int i=1; i<=n; i++){
            // spaces
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // stars
            for (int k=1; k<=(2*i-1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPyramid(5);
    }
}
