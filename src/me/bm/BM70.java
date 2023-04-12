package me.bm;

import java.util.Arrays;

public class BM70 {
    public int minMoney (int[] arr, int aim) {
        // write code here
        //dp[i]=x 凑够i元所需要的最少货币数
        // write code here
        int[] dp = new int[aim+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < aim + 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                int n = i - arr[j];
                if (n < 0) {
                    continue;
                } else if(dp[n] == Integer.MAX_VALUE){
                    continue;
                }else {
                    dp[i] = Math.min(dp[i], dp[n] + 1);
                }
            }
        }
        return dp[aim] == Integer.MAX_VALUE ? -1 : dp[aim];
    }

    public static void main(String[] args) {
        int i = new BM70().minMoney(new int[]{5, 2, 3}, 20);
        System.out.println(i);
    }
}
