package me.bm;

import java.util.Stack;

public class BM65 {
    public String LCS(String s1, String s2) {
        int row = s1.length();
        int col = s2.length();
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < col + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        if (dp[row][col] == 0) {
            return "-1";
        }
        char[] lcs = new char[dp[row][col]];
        int cur = lcs.length - 1;
        while (true) {
            if (s1.charAt(row - 1) == s2.charAt(col - 1)) {
                lcs[cur--] = s1.charAt(row - 1);
                if (cur < 0) {
                    return new String(lcs);
                }
                row--;
                col--;
            } else {
               if (dp[row - 1][col] > dp[row][col - 1]) {
                    //走上面
                    row--;
                } else {
                    //走左面
                    col--;
                }
            }
        }
    }
}
