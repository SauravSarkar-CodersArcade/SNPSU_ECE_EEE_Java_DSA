package com.advanced.dsa.dataStructures.nonLinear.graphs.representations.list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GraphListDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // We cover all the n nodes to get the list
        // Time Complexity = Big O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Adjacency List -> We should be allocating empty lists
        // {{}, {}, {}, {}, {}}; // Without it o/p will be wrong
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i=0; i<=n; i++){
            adjacencyList.add(new ArrayList<>());
        }
        // Read/input the edges from the user
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Directed Graph u --> v
            adjacencyList.get(u).add(v);
        }
        // Print the Adjacency List
        for (int i=1; i<=n; i++){
            System.out.print("Node: " + i + ": List of Neighbours: -> ");
            for (int neighbour :  adjacencyList.get(i)){
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
