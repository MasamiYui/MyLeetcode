package com.company;

public class Leetcode2161 {

    public int[] pivotArray(int[] nums, int pivot) {

        int[] res = new int[nums.length];
        //第一遍循环找到pivot应该插入的位置
        int pivotPos = 0;
        int samePivotNum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                pivotPos ++;
            }
            if(pivot == nums[i]){
                samePivotNum++;
            }
        }

        int left = pivotPos;
        int right = pivotPos+ samePivotNum-1;
        int zl = 0;
        int zr = right+1;

        for(int i =0; i<nums.length; i++){
            if(nums[i] == pivot){
                res[left++] = nums[i];
            }else if(nums[i]<pivot){
                res[zl++] = nums[i];
            }else{
                res[zr++] = nums[i];
            }
        }
        return res;

    }

}
