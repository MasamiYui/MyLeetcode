package me.bm;

public class BM78 {
    public int rob (int[] nums) {
        // write code here
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[][] dp = new int[nums.length][2];
        //第一家偷
        dp[0][0] = nums[0];
        //第一家不偷
        dp[0][1] = 0;
        for (int i = 1; i < nums.length; i++) {
            //第i家偷
            dp[i][0] = dp[i - 1][1] + nums[i];
            //第i家不偷
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }


    public static void main(String[] args) {
        int rob = new BM78().rob(new int[]{2, 10, 5});
        System.out.println(rob);
    }
}
