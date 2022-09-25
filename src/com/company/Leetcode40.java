package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode40 {

    int[] candidates;
    int target;
    int local;
    List<Integer> subRes;
    List<List<Integer>> res;
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;
        this.local = 0;
        this.subRes = new ArrayList<>();
        this.res = new ArrayList<>();
        this.used = new boolean[candidates.length];
        trackback(0);
        return res;
    }

    public void trackback(int start){
        if(local > target){
            return;
        }
        if(local == target){
            if(res.contains(subRes)){
                return;
            }
            res.add(new ArrayList<>(subRes));
            return;
        }
        for(int i =start; i< candidates.length; i++){
            if(used[i] == true){
                continue;
            }
            local = local + candidates[i];
            subRes.add(candidates[i]);
            used[i] = true;
            trackback(i);
            used[i] = false;
            local = local - candidates[i];
            subRes.remove(subRes.size() -1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Leetcode40().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(lists);
    }

}
