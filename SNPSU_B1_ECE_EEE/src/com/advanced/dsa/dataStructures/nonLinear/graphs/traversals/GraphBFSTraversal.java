package com.advanced.dsa.dataStructures.nonLinear.graphs.traversals;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class GraphBFS {
    public List<Integer> bfsGraph(int V,
                                  List<List<Integer>> adjList){
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V + 1]; // 0-based index
        Queue<Integer> q = new LinkedList<>();
        // Start the BFS from node 1
        visited[1] = true;
        q.add(1);
        while (!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            // Travel all of its neighbours
            // If they are not visited, push all to the queue
            // If visited - skip
            for (int neighbour : adjList.get(node)){
                if (!visited[neighbour]){ // if not visited
                    visited[neighbour] = true; // Mark true
                    q.add(neighbour); // Push to queue
                }
            }
        }
        return result; // return the output as a List<Integer>
    }
}
public class GraphBFSTraversal {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        // We need to initialize empty arrays
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        // Add the given edges in the undirected graph
        addEdge(adjList, 1,2);
        addEdge(adjList, 1,3);
        addEdge(adjList, 2,3);
        addEdge(adjList, 3,4);
        addEdge(adjList, 4,5);
        addEdge(adjList, 2,5);
        GraphBFS obj = new GraphBFS();
        List<Integer> result = obj.bfsGraph(V, adjList);
        printBFS(result);
    }
    public static void addEdge(List<List<Integer>> adjList,
                               int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u); // Only for undirected
    }
    public static void printBFS(List<Integer> result){
        for (int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
