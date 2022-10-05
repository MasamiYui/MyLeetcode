package me.nextJourney;

public class LeetCode300 {
    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int result = 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i=1; i<nums.length; i++){
            dp[i] = 1;
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new LeetCode300().lengthOfLIS(new int[]{0});
        System.out.println(result);
    }
}
