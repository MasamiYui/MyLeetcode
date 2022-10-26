package me.nextJourney;

public class LeetCode718 {
    public int findLength(int[] num1, int[] num2) {
        int result =0;
        int len1 = num1.length, len2 = num2.length;
        int[][]dp = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if(num1[i] == num2[j]){
                    if(i-1<0 || j-1<0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                }else{
                    dp[i][j] = 0;
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int length = new LeetCode718().findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0});
        System.out.println(length);
    }

}
