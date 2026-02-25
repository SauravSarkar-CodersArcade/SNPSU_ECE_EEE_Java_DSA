package com.basics.patterns;
public class IdentityMatrix {
    static void identityMatrix(int n){
        for (int r=1; r<=n; r++){
            for (int c=1; c<=n; c++){
                if(r == c){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        identityMatrix(5);
    }
}
