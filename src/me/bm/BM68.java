package me.bm;

public class BM68 {
    public int minPathSum (int[][] matrix) {
        // write code here
        int row = matrix.length;
        int col = matrix[0].length;
        int[][]dp = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 && j==0){
                    dp[i][j] = matrix[i][j];
                }else if (i == 0) {
                    dp[i][j] = dp[i][j-1] + matrix[i][j];
                }else if(j ==0){
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                }else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
                }
            }
        }
        return dp[row-1][col-1];
    }
}
