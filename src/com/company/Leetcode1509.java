package com.company;

import java.util.Arrays;

public class Leetcode1509 {

    public int minDifference(int[] nums) {

        //先排序
        Arrays.sort(nums);
        int window = nums.length - 4;
        int result = Integer.MAX_VALUE;
        for(int i=0; i<4; i++){
            result = Math.min(nums[i+window]- nums[i], result);
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new Leetcode1509().minDifference(new int[]{6,6,0,1,1,4,6});
        System.out.printf(""+i);
    }
}
