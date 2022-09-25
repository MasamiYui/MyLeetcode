package com.company;

public class Leetcode198 {
    public int rob(int[] nums) {

        int len = nums.length;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return nums[0];
        }
        if(len == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] res = new int[len];
        res[0] = nums[0];
        res[1] = Math.max(nums[1], nums[0]);
        for(int i=2; i< len; i++){
            res[i] = Math.max((res[i-2] + nums[i]), res[i-1]);
        }
        return res[len-1];
    }

    public static void main(String[] args) {
        int[] testData = new int[]{2,1,1,2};
        int res = new Leetcode198().rob(testData);
        System.out.println(res);
    }




}
