package com.basics.arrays;
public class E3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9}; // 1 Dimensional Array
        System.out.println(arr.length);
        // 2D Array or Matrix or [Array of Arrays]
        int[][] matrix = {{1,2,3},  // 0
                          {4,5,6},  // 1
                          {7,8,9},  // 2
                          {9,8,7}}; // 3
        // Total number of rows = Length of the matrix
        System.out.println(matrix.length); // Total no of rows
        System.out.println(matrix[0].length); // Length of 1st Row
        for (int r=0; r<matrix.length; r++){ // Rows
            for (int c=0; c<matrix[0].length; c++){ // Cols
                System.out.print(matrix[r][c] + " "); // Cell [r][c]
            }
            System.out.println();
        }
        // When in a 2D array or Matrix - the rows are not equal
        // This type of array is called "JAGGED ARRAY"
        char[][] languages = {{'K','a','n','n','a','d','a'},
                              {'T','e','l','u','g','u'},
                              {'M','a','l','a','y','a','l','a','m'},
                              {'T','a','m','i','l'},
                              {'K','o','n','k','a','n','i'}};
        System.out.println(languages[0].length); // Length of 1st row
        System.out.println(languages[3].length); // Length of 4th row
        System.out.println(languages[4].length); // Length of 5th row
        // Traversal in a Jagged Array
        for (int r=0; r<languages.length; r++){ // row 0 till row 4
            for (int c=0; c<languages[r].length; c++){
                System.out.print(languages[r][c] + " ");
            }
            System.out.println();
        }

        int[][] jagged = {{1,2,3,4,5,6,7,8,9},
                          {1,2,3,4,5},
                          {1}};
        for (int row = 0; row<jagged.length; row++){
            for (int col = 0; col<jagged[row].length; col++){
                System.out.print(jagged[row][col] + " ");
            }
            System.out.println();
        }

    }
}
