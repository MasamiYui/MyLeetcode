package me.nextJourney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode46 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        traceBack(result, list, nums, used);
        return result;
    }

    public void traceBack(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] used){
        if(list.size() == used.length){
            List<Integer> subResult = new ArrayList<>(list);
            result.add(subResult);
        }
        for(int i=0; i<used.length; i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i] = true;
                traceBack(result, list, nums, used);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> permute = new Leetcode46().permute(new int[]{1, 2, 3});
        System.out.println(permute);
    }





}
