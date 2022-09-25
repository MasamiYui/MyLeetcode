package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode39 {

    int[] candidates = null;
    int target;
    List<Integer> subRes = new ArrayList<>();
    int subTotal;
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        subTotal = 0;
        this.candidates = candidates;
        this.target = target;
        trackBack(0);
        return res;
    }

    public void trackBack(int start){
        if(subTotal > target){
            return;
        }
        if(subTotal == target){
            res.add(new ArrayList<>(subRes));
            return;
        }
        if(subTotal < target){
            for(int i =start; i<candidates.length; i++){
                subRes.add(candidates[i]);
                subTotal = subTotal + candidates[i];
                trackBack(i);
                subRes.remove(subRes.size() - 1);
                subTotal = subTotal - candidates[i];
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Leetcode39().combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(lists);
    }

}
