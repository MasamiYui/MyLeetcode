package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode377 {

    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] cache = new int[target +1];
        cache[0] =1;
        return dfs(nums, target, cache);

    }

    public int dfs(int[] nums, int target, int[] cache){
        if(cache[target] > 0){
            return cache[target];
        }
        if(target == 0){
            return 1;
        }


        if(target < 0){
            return 0;
        }

        int res = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[i] > target){
                continue;
            }
            res = res + dfs(nums, target - nums[i], cache);
        }
        cache[target] = res;
        return res;
    }



    public static void main(String[] args) {
        int[] arg1 = new int[]{1,2,3};
        int arg2 = 4;
        int i = new Leetcode377().combinationSum4(arg1, arg2);
        System.out.println(i);
    }



}
