package me.nextJourney;

public class LeetCode169 {
    public int majorityElement(int[] nums) {

       int count = 0;
       Integer candidate = null;
       for(int i=0; i<nums.length; i++){
           if(count == 0){
               candidate = nums[i];
           }
           if(nums[i] == candidate){
               count++;
           }else{
               count--;
           }
       }
       return candidate;
    }
}
