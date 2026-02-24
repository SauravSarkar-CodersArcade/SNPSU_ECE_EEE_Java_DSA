package com.basics.loopingStatements;
public class BreakStatement {
    public static void main(String[] args) {
        // break statement ends the loop & goes out of the loop
        for(int i=1; i<5; i++){
            if(i == 3){
                break;
            }
            System.out.print(i + " ");
        }

    }
}
