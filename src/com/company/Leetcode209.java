package com.company;

public class Leetcode209 {
    public int minSubArrayLen(int s, int[] nums) {

        if(nums.length ==0){
            return 0;
        }
        int left =0;
        int right = -1;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while(left < nums.length){
            if(right + 1 < nums.length && sum < s){
                right++;
                sum = sum + nums[right];
            }else{
                sum = sum - nums[left];
                left++;
            }
            if(sum >= s){
                res = Math.min(res, right - left +1);
            }
        }

        return res == Integer.MAX_VALUE? 0: res;
    }

    public static void main(String[] args) {
        int[] testData = new int[]{2, 3, 1, 2, 4, 3};
        int res = new Leetcode209().minSubArrayLen(7, testData);
        System.out.println(res);
    }
}
