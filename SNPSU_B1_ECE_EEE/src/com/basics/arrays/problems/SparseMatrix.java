package com.basics.arrays.problems;
public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,3},
                {0,0,0},
                {4,0,0}
        };
        int rows = matrix.length; // 3
        int cols = matrix[0].length; // 3
        int zeroCount = 0, nonZeroCount = 0;
        // Traverse the matrix
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] == 0){
                    zeroCount++;
                }else {
                    nonZeroCount++;
                }
            }
        }
        if (zeroCount > nonZeroCount){
            System.out.println("Matrix is Sparse.");
        }else {
            System.out.println("Matrix is Not Sparse.");
        }
    }
}
