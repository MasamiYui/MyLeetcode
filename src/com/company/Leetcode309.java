package com.company;

public class Leetcode309 {

    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0){
            return 0;
        }
        //int res = 0;
        int[][]dp = new int[3][prices.length];
        dp[0][0] = 0 - prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for(int i =1; i<prices.length; i++){
            dp[0][i] = Math.max(dp[2][i-1]-prices[i],dp[0][i-1]);
            dp[1][i] = dp[0][i-1]+prices[i];
            dp[2][i] = Math.max(dp[2][i-1], dp[1][i-1]);
        }
        return  Math.max(dp[1][prices.length-1], dp[2][prices.length-1]);

    }

    public static void main(String[] args) {
        int[] testData = new int[]{1,2,3,0,2};
        int res = new Leetcode309().maxProfit(testData);
        System.out.println(res);
    }


}
