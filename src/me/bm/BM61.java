package me.bm;

public class BM61 {
    int res = 0;
    public int solve (int[][] matrix) {
        int row = matrix.length;
        if(row < 1){
            return 0;
        }
        int col = matrix[0].length;
        int result = 0;
        int[][] dp = new int[row][col];

        for(int i =0; i<row; i++){
            for (int j = 0; j < col; j++) {
                res = Math.max(res, dfs(matrix, dp, i, j ,-1));
            }
        }



        return res;
    }

    public int dfs(int[][] matrix, int[][] dp, int row, int col, int preValue) {
      if(row>= matrix.length || row <0 || col>=matrix[0].length || col <0){
          return 0;
      }
      if(matrix[row][col] <=preValue){
          return 0;
      }
      if(dp[row][col] != 0){
          return dp[row][col];
      }
      dp[row][col] = 1;

      int up = dfs(matrix, dp, row-1, col, matrix[row][col]);
      int down = dfs(matrix, dp, row+1, col, matrix[row][col]);
      int left = dfs(matrix, dp, row, col-1, matrix[row][col]);
      int right = dfs(matrix, dp, row, col + 1, matrix[row][col]);
      dp[row][col] = max(up, down, left, right) + 1;
      return dp[row][col];
    }

    public int max(int i1, int i2, int i3, int i4){
        return Math.max(Math.max(Math.max(i1,i2), i3),i4 );
    }

}
