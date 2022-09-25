package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode229 {
    public static void main(String[] args) {

        //1,1,2,2,7,7,8,8,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3
        //int[] testData = new int[]{1,1,2,2,7,7,8,8,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3};
        int[] testData = new int[]{1,2};
        List<Integer> res = new Leetcode229().majorityElement(testData);
        System.out.println(res);
    }

    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();
        int res1 = nums[0];
        int res2 = nums[0];
        int count1= 0;
        int count2= 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i] == res1){
                count1++;
            }else if(nums[i] == res2){
                count2++;
            }else if(count1 == 0){
                res1= nums[i];
                res1 =count1+1;
            }else if(count2 ==0){
                res2 = nums[i];
                res2 = count2+1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 =0;
        count2 =0;
        for (int num : nums) {
            if(num == res1){
                count1++;
            }else if(num == res2){
                count2++;
            }else{
                //do nothing
            }
        }
        if(count1> nums.length/3){
            res.add(res1);
        }
        if(count2> nums.length/3 && res1 != res2){
            res.add(res2);
        }
        return res;
    }
}
