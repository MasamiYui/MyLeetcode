package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode47 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> localList = new ArrayList<>();
    boolean[] used = null;
    int[] nums = null;

    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length == 0){
            return res;
        }
        used = new boolean[nums.length];
        this.nums = nums;
        trackBack();

        return res;
    }


    public void trackBack(){
        if(localList.size() == nums.length){
            ArrayList<Integer> integers = new ArrayList<>(localList);
            if(!res.contains(integers)){
                res.add(integers);
            }
            return;
        }
        for(int i =0; i< nums.length; i++){
            if(used[i]){
                continue;
            }
            if(i>0 && nums[i] == nums[i-1] && used[i]){
                continue;
            }
            if(!used[i]){
                used[i] = true;
                localList.add(nums[i]);
                trackBack();
                used[i] = false;
                localList.remove( localList.size()- 1);
            }

        }
    }

}
