package me.nextJourney;

public class Leetcode200 {
    public int numIslands(char[][] grid) {

        int result = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (visited[i][j] == 0 && grid[i][j] == '1') {
                    result++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return result;
    }

    public void dfs(char[][] grid, int[][] visited, int i, int j) {
        if (i >= grid.length || i<0 || j >= grid[0].length || j<0) {
            return;
        }
        if (visited[i][j] == 0 && grid[i][j] == '1') {
            visited[i][j] = 1;
            dfs(grid, visited, i + 1, j);
            dfs(grid, visited, i-1 ,j);
            dfs(grid, visited, i, j + 1);
            dfs(grid, visited, i, j-1);
        }
    }

    public static void main(String[] args) {
        char[][] testCase = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int result = new Leetcode200().numIslands(testCase);
        System.out.println(result);
    }
}
