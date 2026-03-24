package com.advanced.dsa.dataStructures.nonLinear.graphs.algorithms.topoSort.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class TopologicalSortDFS {
    // Helper method for the dfs
    private void dfs(int node, int[] vis, Stack<Integer> st,
                     ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for (int neighbour : adj.get(node)){
            if (vis[neighbour] == 0){
                dfs(neighbour, vis, st, adj);
            }
        }
        st.push(node); // Only after dfs finishes, push to stack
    }
    public List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        // We will do a component-wise-traversal if the node is not-visited
        for (int i=0; i<V; i++){
            if (vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        // After all dfs calls end, pop from stack & store in list
        List<Integer> ans = new ArrayList<>();
        while (!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // We have to initialize with empty arrays
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopologicalSortDFS obj = new TopologicalSortDFS();
        List<Integer> ans = obj.topoSort(V, adj);
        System.out.println("The TopoSort Linear Ordering u --> v is: ");
        for (int node : ans){
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
