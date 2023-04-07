package me.nextJourney;

import java.util.zip.InflaterInputStream;

public class LeetCode152 {
    public int maxProduct(int[] nums) {

        int result = nums[0];
        int len = nums.length;
        int[][]dp = new int[len][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];

        for(int i=1; i< len; i++){
            if(nums[i] >= 0){
                dp[i][1] = Math.max(nums[i], dp[i-1][1] * nums[i]);
                result = Math.max(dp[i][1], result);
                dp[i][0] = Math.min(nums[i], dp[i-1][0] * nums[i]);
            }else{
                dp[i][1] = Math.max(nums[i], dp[i - 1][0] * nums[i]);
                result = Math.max(dp[i][1], result);
                dp[i][0] = Math.min(nums[i], dp[i - 1][1] * nums[i]);
            }
        }

        return result;
    }
}
