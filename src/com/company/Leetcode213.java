package com.company;

public class Leetcode213 {
    public int rob(int[] nums) {

        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        if(len == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[][]dp = new int[len][2];//0:没偷第0家，1：偷了第0家
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        dp[1][1] = nums[0];
        dp[1][0] = nums[1];
        for(int i=2; i< len; i++){
            if(i == len -1){
                dp[i][0] = Math.max((dp[i-2][0]+nums[i]), dp[i-1][0]);
                dp[i][1] = dp[i-1][1];
            }else{
                dp[i][0] = Math.max((dp[i-2][0]+nums[i]), dp[i-1][0]);
                dp[i][1] = Math.max((dp[i-2][1]+nums[i]), dp[i-1][1]);
            }
        }

        return Math.max(dp[len-1][0], dp[len-1][1]);
    }

    public static void main(String[] args) {

    }

}
