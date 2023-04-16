package me.bm;

import java.util.Arrays;

public class BM79 {
    public int rob (int[] nums) {
        // write code here
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[][] dp1 = new int[nums.length][2];
        int[][] dp2 = new int[nums.length][2];
        //第一家偷
        dp1[0][0] = nums[0];
        //第二家不偷
        dp1[0][1] = nums[0];
        //第二家偷
        dp1[1][0] = nums[0];
        dp1[1][1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            //第i家偷
            dp1[i][0] = dp1[i - 1][1] + nums[i];
            //第i家不偷
            dp1[i][1] = Math.max(dp1[i - 1][0], dp1[i - 1][1]);
        }

        //第一家不偷
        dp2[0][1] = 0;
        dp2[0][0] = 0;
        //第二家偷
        dp2[1][0] = nums[1];
        //第二家不偷
        dp2[1][1] = 0;
        for (int i = 2; i < nums.length; i++) {
            //第i家偷
            dp2[i][0] = dp2[i - 1][1] + nums[i];
            //第i家不偷
            dp2[i][1] = Math.max(dp2[i - 1][0], dp2[i - 1][1]);
        }

        return Math.max(dp1[nums.length - 1][1], dp2[nums.length - 1][0]);
    }

    public static void main(String[] args) {
        int rob = new BM79().rob(new int[]{25,85,17,19,10,6,3,32,93,64});
        System.out.println(rob);
    }

}
