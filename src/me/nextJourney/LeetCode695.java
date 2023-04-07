package me.nextJourney;

public class LeetCode695 {
    public int maxAreaOfIsland(int[][] grid) {

        int result =0;
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){
                    result = Math.max(result, dfs(grid, visited, i, j));
                }
            }
        }
        return result;
    }

    private int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length){
            return 0;
        }
        if(visited[i][j] || grid[i][j] == 0){
            return 0;
        }
        visited[i][j] =true;
        return 1 + dfs(grid, visited, i-1, j) + dfs(grid, visited, i+1, j) + dfs(grid, visited, i, j-1) + dfs(grid, visited, i, j+1);
    }
}
