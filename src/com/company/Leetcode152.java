package com.company;

public class Leetcode152 {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] localMax = new int[len];
        int[] localMin = new int[len];
        int res = nums[0];
        localMin[0] = nums[0];
        localMax[0] = nums[0];
        for(int i =1; i<len; i++){
            if(nums[i]>0){
                localMin[i] = Math.min(localMin[i-1]*nums[i], nums[i]);
                localMax[i] = Math.max(localMax[i-1]*nums[i], nums[i]);
            }else if(nums[i] <0){
                localMin[i] = Math.min(localMax[i-1]*nums[i], nums[i]);
                localMax[i] = Math.max(localMin[i-1]*nums[i], nums[i]);
            }else{//nums[i] ==0
                localMin[i] = 0;
                localMax[i] = 0;
            }
            res = Math.max(localMax[i], res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{2,3,-2,4};
        int res = new Leetcode152().maxProduct(testArr);
        System.out.println(res);
    }
}
