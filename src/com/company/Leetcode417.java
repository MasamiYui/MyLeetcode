package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode417 {


    public List<List<Integer>> pacificAtlantic(int[][] matrix) {

        List<List<Integer>> res = new ArrayList<>();
        int m = matrix.length;
        if(m ==0) {
            return res;
        }
        int n = matrix[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        //top and bottom
        for(int col =0; col<n; col++){
            dfs(matrix, 0, col, matrix[0][col], pacific);
            dfs(matrix, m-1, col, matrix[m-1][col], atlantic);
        }

        for(int row =0; row<m; row++){
            dfs(matrix, row, 0, matrix[row][0], pacific);
            dfs(matrix, row , n-1, matrix[row][n-1], atlantic);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(i);
                    cur.add(j);
                    res.add(cur);
                }
            }
        }
        return res;
    }

    private void dfs(int[][] matrix, int r, int c, int preHeight, boolean[][] ocean){
        //exit
        if(r > matrix.length -1 || r<0 || c<0 || c>matrix[0].length-1 ||matrix[r][c] < preHeight || ocean[r][c]){
            return;
        }

        ocean[r][c] = true;
        dfs(matrix, r+1, c, matrix[r][c], ocean);
        dfs(matrix, r-1, c, matrix[r][c], ocean);
        dfs(matrix, r, c+1, matrix[r][c], ocean);
        dfs(matrix, r, c-1, matrix[r][c], ocean);
    }

    public static void main(String[] args) {
        int[][] testArr = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        List<List<Integer>> lists = new Leetcode417().pacificAtlantic(testArr);
        System.out.println(lists);
    }




}
