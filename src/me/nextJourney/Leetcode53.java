package me.nextJourney;

public class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        //dp[x] is when select x the max result
        int[] dp = new int[nums.length];
        //dp init
        dp[0] = nums[0];
        for(int i=1; i< nums.length; i++){
            if(dp[i-1]<0){
                dp[i] = nums[i];
            }else{
                dp[i] = dp[i-1] + nums[i];
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testCase = {5,4,-1,7,8};
        int result = new Leetcode53().maxSubArray(testCase);
        System.out.println(result);
    }
}
