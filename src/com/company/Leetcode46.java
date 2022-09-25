package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode46 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> localList = new ArrayList<>();
    boolean[] used = null;
    int[] nums = null;

    public List<List<Integer>> permute(int[] nums) {
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
            res.add(integers);
            return;
        }
        for(int i =0; i< nums.length; i++){
            if(!used[i]){
                used[i] = true;
                localList.add(nums[i]);
                trackBack();
                used[i] = false;
                localList.remove( localList.size()- 1);
            }

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> permute = new Leetcode46().permute(new int[]{1, 2, 3});
        permute.forEach(list->{
            System.out.println(list.toString());
        });

    }
}
