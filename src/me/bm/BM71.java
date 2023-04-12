package me.bm;

public class BM71 {
    public int LIS (int[] arr) {
        if (arr.length <= 1) {
            return arr.length;
        }
        int res = 0;
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] <= arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            dp[i] = dp[i] == 0 ? 1 : dp[i];
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int lis = new BM71().LIS(new int[]{3,5,7,1,2,4,6,3,8,9,5,6});
        System.out.println(lis);
    }
}
