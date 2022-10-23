package me.nextJourney;

public class LeetCode64 {

    public int minPathSum(int[][] grid) {

        int[][] dp = new int[grid.length][grid[0].length];

        //init
        for(int i=0; i<grid[0].length; i++){
            if(i==0){
                dp[0][i] = grid[0][i];
            }else{
                dp[0][i] = dp[0][i-1]+ grid[0][i];
            }
        }

        for(int i=0; i<grid.length; i++){
            if(i==0){
                dp[i][0] = grid[i][0];
            }else{
                dp[i][0] = dp[i-1][0] + grid[i][0];
            }
        }

        for(int i=1; i<grid.length; i++){
            for(int j=1; j<grid[0].length; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }

        return dp[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] testCase = {{1, 2, 3}, {4, 5, 6}};
        int result = new LeetCode64().minPathSum(testCase);
        System.out.println(result);

    }
}
