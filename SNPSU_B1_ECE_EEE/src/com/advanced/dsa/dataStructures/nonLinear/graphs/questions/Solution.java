package com.advanced.dsa.dataStructures.nonLinear.graphs.questions;
public class Solution {
    // Directions : Top, Bottom, Right, Left & 4 Diagonals
    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public int countIslands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        // Visited Matrix to track visited cells
        boolean[][] visited = new boolean[n][m];
        int islandCount = 0;
        // Traverse each cell
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                // If it is a Land 'L' & it is not visited - do a dfs call & count
                if (grid[i][j] == 'L' & !visited[i][j]){
                    dfs(i,j,grid,visited,n,m);
                    islandCount++; // Increment the count of islands
                }
            }
        }
        return islandCount;
    }
    void dfs(int x, int y, char[][] grid, boolean[][] visited, int n, int m){
        visited[x][y] = true; // Mark the visited cell as true
        // We can travel at most 8 directions
        for (int dir = 0; dir < 8; dir++){
            int newX = x + dx[dir];
            int newY = y + dy[dir];
            // Make sure the values are inside the boundary (0 to n-1)
            // They should be Lands 'L', they should not be visited
            if (newX >= 0 && newY >= 0 && newX < n && newY < m &&
                grid[newX][newY] == 'L' && !visited[newX][newY]){
                dfs(newX, newY, grid, visited, n, m);
            }
        }
    }
}
