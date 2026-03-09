package com.basics.arrays;
public class E4 {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4,5},
                           {6,7},
                           {8}};
        for (int[] x : numbers){
            for (int n : x){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println();
        char[][] names = {{'M','e','g','h','a'},
                          {'P','r','i','y','a','n','k','a'},
                          {'L','i','k','i','t','h','a'},
                          {'L','i','k','i','t','h'},
                          {'S','o','n','i','y','a'}};
        for (char[] ch : names){
            for (char c : ch){
                System.out.print(c + " ");
            }
            System.out.println();
        }
        boolean[][] data = {{true, false, true},
                            {false},
                            {true, true}};
        for (boolean[] bool : data){
            for (boolean b : bool){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
