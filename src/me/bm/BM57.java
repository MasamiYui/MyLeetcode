package me.bm;

public class BM57 {
    int result = 0;
    public int solve (char[][] grid) {
        // write code here
        result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    result++;
                    dfs(grid, visited,i,j);
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        if(i<0 || i>= grid.length || j<0|| j>= grid[0].length || grid[i][j] == '0' || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        if( i > 0){
            dfs(grid,visited, i-1, j);
        }
        if( j > 0){
            dfs(grid,visited, i, j-1);
        }
        dfs(grid, visited, i+1, j);
        dfs(grid, visited, i, j+1);
    }

    public static void main(String[] args) {
        int solve = new BM57().solve(new char[][]{
                {'1', '1', '0', '0', '0'}, {'0', '1', '0', '1', '1'}, {'0', '0', '0', '1', '1'}, {'0', '0', '0', '0', '0'}, {'0', '0', '1', '1', '1'}
        });
        System.out.println(solve);
    }


}
