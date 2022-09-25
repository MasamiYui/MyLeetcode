package com.company;

public class Leetcode154 {
    public int findMin(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        int pre = 0;
        int local = 1;
        boolean flag = false;
        while(local<nums.length){
            if(nums[pre] <= nums[local]){
                pre = pre +1;
                local = local+1;
            }else{
                flag = true;
                break;
            }
        }
        if(flag){
            return nums[local];
        }else{
            return nums[0];
        }
    }
}
