package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode283 {

    public void moveZeroes(int[] nums) {
//        Queue<Integer> queue = new LinkedList<>();
//        for (int num : nums) {
//            if(num != 0){
//                queue.add(num);
//            }
//        }
//        for(int i=0; i<nums.length; i++){
//            if(!queue.isEmpty()){
//                nums[i] = queue.poll();
//            }else{
//                nums[i] = 0;
//            }
//        }
        int fast = 0;
        int slow = 0;
        for(; fast<nums.length; fast++){
            if(nums[fast] != 0){
                nums[slow++] = nums[fast];
            }
        }
        for(int i=slow; i<nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

    }
}
