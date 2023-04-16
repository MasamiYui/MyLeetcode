package me.bm;

public class BM81 {
    public int maxProfit (int[] prices) {
        // write code here
        int[][]dp = new int[prices.length][2];
        //第一天买入
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for(int i = 1; i < dp.length; i++){
            //买入
            dp[i][0] = Math.max(dp[i-1][1] - prices[i], dp[i-1][0]);
            //卖出
            dp[i][1] = Math.max(dp[i-1][0] + prices[i], dp[i-1][1]);
        }
        return dp[prices.length-1][1];
    }
}
