package com.basics.patterns;
public class RightAngledTriangle {
    static void rightTriangle(int n){
        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print(". ");
            }
            System.out.println();
        }
    }
    static void rightTriangleNumbers(int n){
        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rightTriangle(5);
        rightTriangleNumbers(5);
    }
}
