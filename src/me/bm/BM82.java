package me.bm;

public class BM82 {
    public int maxProfit (int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int[][][] dp = new int[prices.length][2][2];
        //第一天-买入-第一次，
        dp[0][0][0] = -prices[0];
        //第一天-卖出-第一次
        dp[0][1][0] = 0;
        //第一天-买入-第二次
        dp[0][0][1] = -prices[0];
        //第一天-卖出-第二次
        dp[0][1][0] = 0;
        for(int i =1; i< prices.length; i++){
            //第i天-买入状态-第1次
            dp[i][0][0] = Math.max(dp[i-1][0][0],-prices[i]);
            //第i天-卖出状态-第1次
            dp[i][1][0] = Math.max(dp[i-1][0][0] + prices[i], dp[i-1][1][0]);
            //第i天-买入状态-第2次
            dp[i][0][1] = Math.max(dp[i-1][1][0] - prices[i], dp[i-1][0][1]);
            //第i天-卖出状态-第2次
            dp[i][1][1] = Math.max(dp[i-1][0][1] + prices[i], dp[i-1][1][1]);
        }
        return Math.max(dp[prices.length-1][1][0], dp[prices.length-1][1][1]);
    }

    public static void main(String[] args) {
        int i = new BM82().maxProfit(new int[]{44,13,17,72,99,23,27,63,83});
        System.out.println(i);
    }
}
