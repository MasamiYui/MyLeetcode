package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Leetcode228 {
    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();
        int temp = 0;
        for(int i =0; i< nums.length; i++){
            int j = i+1;
            if(j<nums.length && nums[i] +1 == nums[j]){
                j++;
            }else{
                if(temp == j-1){
                    res.add(String.valueOf(nums[temp]));
                }else{
                    //多个元素
                    res.add(nums[temp] + "->" + nums[j-1]);
                }
                temp = j;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] testData = new int[]{0};
        List<String> res = new Leetcode228().summaryRanges(testData);
        System.out.println(res);
    }
}
