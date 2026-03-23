package com.advanced.dsa.dataStructures.nonLinear.graphs.representations.matrix;
import java.util.Scanner;
public class GraphMatrixDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // We cover all the n nodes to get the matrix
        // Time Complexity = Big O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Directed Graph u --> v
        // For 0-based indexing it is better to take n+1, n+1
        int[][] adjacencyMatrix = new int[n+1][n+1];
        // Take the input of the edges from the user
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjacencyMatrix[u][v] = 1;
        }
        // Print the adjacency matrix
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close(); // Close the resource after using it
    }
}
