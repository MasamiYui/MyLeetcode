package com.company;

public class Leetcode221 {

    public int maximalSquare(char[][] matrix) {

        if(matrix == null){
            return 0;
        }
        int res = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if(matrix[i][j] == '1'){
                    if(i ==0 || j ==0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    }
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res*res;
    }


}
