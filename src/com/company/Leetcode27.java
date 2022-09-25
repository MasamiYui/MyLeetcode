package com.company;

import java.rmi.UnexpectedException;

public class Leetcode27 {
    public int removeElement(int[] nums, int val) {

        int target =0;
        int result =0;
        int next =0;
        while(next <= nums.length-1 && nums[next] == val){
            next++;
        }
        if(next > nums.length -1){
            return 0;
        }
        nums[target] = nums[next];
        next++;
        //next = target + 1;
        result = 1;
        while(next <= nums.length -1){
            if(nums[next] == val){
                next++;
            }else{
                nums[++target] = nums[next];
                next++;
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new Leetcode27().removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(i);
    }


}
