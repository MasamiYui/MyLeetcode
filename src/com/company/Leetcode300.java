package com.company;

import java.util.List;

public class Leetcode300 {
    int res = 0;
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        for(int i=1; i<nums.length; i++){
            dp[i] = 1;
            for(int j=i-1; j> 0; j--){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i]+1, dp[i]);
                }
            }
            res = Math.max(dp[i], res);
        }

        return res;
    }


}
