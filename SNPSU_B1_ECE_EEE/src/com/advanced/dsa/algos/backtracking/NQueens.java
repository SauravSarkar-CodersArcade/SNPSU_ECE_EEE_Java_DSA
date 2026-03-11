package com.advanced.dsa.algos.backtracking;
public class NQueens {
    // Function to check if it is safe to place a queen
    static boolean isSafe(char[][] board, int row, int col, int n){
        // Check the column
        for (int i=0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Check left diagonal
        for (int i=row-1, j=col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // Check right diagonal
        for (int i=row-1, j=col+1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    // Backtracking Function
    static void solve(char[][] board, int row, int n){
        // Base Case -> If all queens have been placed
        if (row == n){
            printBoard(board, n);
            System.out.println();
            return;
        }
        // Try placing the queen in every row
        for (int col = 0; col < n; col++){
            if (isSafe(board, row, col, n)){
                board[row][col] = 'Q'; // place queen
                solve(board, row + 1, n); // recursive call for next row
                board[row][col] = '.'; // Backtracking (remove queen)
            }
        }
    }
    static void printBoard(char[][] board, int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4; // 4 Queens Problem
        char[][] board = new char[n][n];
        // Initialize the board with dots . . . .
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        solve(board, 0, n);
    }
}
