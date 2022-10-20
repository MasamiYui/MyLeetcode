package me.nextJourney;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode322 {


    public int coinChange(int[] coins, int amount) {

        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];

    }


    public static void main(String[] args) {
        int i = new LeetCode322().coinChange(new int[]{1,2147483647}, 2);
        System.out.println(i);
    }
}
