package me.bm;

public class BM64 {
    public int minCostClimbingStairs (int[] cost) {
        // write code here
        if(cost.length <= 2){
            return 0;
        }

        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i<cost.length+1; i++){
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        return dp[cost.length];
    }

    public static void main(String[] args) {
        int i = new BM64().minCostClimbingStairs(new int[]{2, 5, 20});
        System.out.println(i);
    }
}
