package me.nextJourney;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode78 {


    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subResult = new ArrayList<>();
        backTrack(result, subResult, nums, 0);
        return result;
    }

    public void backTrack(List<List<Integer>> result, List<Integer> subResult, int[] nums, int localNum){
        result.add(new ArrayList<>(subResult));
        for(int i = localNum; i<nums.length; i++){
            subResult.add(nums[i]);
            backTrack(result, subResult, nums, i + 1);
            subResult.remove( subResult.size() -1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> subsets = new LeetCode78().subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}
