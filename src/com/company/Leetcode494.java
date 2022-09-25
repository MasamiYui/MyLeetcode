package com.company;

public class Leetcode494 {
    int result = 0;
    public int findTargetSumWays(int[] nums, int target) {

        dfs(nums, 0, 0, target);
        return result;
    }


    void dfs(int[] nums, int value, int idx, int target){
        if(idx == nums.length){
            if(value == target){
                result++;
            }
        }else{
            dfs(nums, value+nums[idx], idx+1, target);
            dfs(nums, value-nums[idx], idx+1, target);
        }
    }

    public static void main(String[] args) {
        int[] nums= {1,0};
        int target = 1;
        System.out.println(new Leetcode494().findTargetSumWays(nums, target));

    }
}
