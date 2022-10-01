package me.nextJourney;

public class Leetcode121 {
    public int maxProfit(int[] prices) {

        int result = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return result > 0? result:0;
    }


    public void backup(){
        //0 is buy and 1 is sell
//        int result = 0;
//        int[][] dp = new int[prices.length][2];
//        for(int i=0; i<prices.length; i++){
//            if(i ==0){
//                dp[i][0] = -prices[i];//buy
//                dp[i][1] = 0;//sell
//            }else{
//                dp[i][0] = dp[i-1][1] - prices[i];//buy
//                dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
//                result = Math.max(result, dp[i][1]);
//            }
//        }
//        return result;
    }

    public static void main(String[] args) {
        int[] testCase = {7,1,5,3,6,4};
        int result = new Leetcode121().maxProfit(testCase);
        System.out.println(result);
    }
}
