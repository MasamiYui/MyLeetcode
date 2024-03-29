package me.bm;

public class BM67 {
    public int uniquePaths (int m, int n) {
        // write code here
        int[][]dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (i == 0 || j==0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int i = new BM67().uniquePaths(2, 1);
        System.out.println(i);
    }
}
