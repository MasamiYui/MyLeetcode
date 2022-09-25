package com.company;

public class Leetcode169 {
    public int majorityElement(int[] nums) {

        int cand = 0;
        int count =0;
        for(int i =0; i< nums.length; i++){
            if(count == 0){
                cand = nums[i];
                count = 1;
                continue;
            }
            if(nums[i] == cand){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }
}
