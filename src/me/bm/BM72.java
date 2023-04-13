package me.bm;

public class BM72 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0){
            return 0;
        }
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int result= dp[0];
        for(int i=1; i<array.length; i++){
            if(dp[i-1] >=0){
                dp[i] = dp[i-1] + array[i];
            }else{
                dp[i] = array[i];
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
