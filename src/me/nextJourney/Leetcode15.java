package me.nextJourney;

import java.util.*;

public class Leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] > 0){
                break;
            }

            if(i >0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length -1;
            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    while(left < right && nums[left] == nums[++left]){}
                }else if(sum >0){
                    while (left < right && nums[right] == nums[--right]){}
                }else{
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[++left]){}
                    while (left < right && nums[right] == nums[--right]){}
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testCase = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = new Leetcode15().threeSum(testCase);
        System.out.println(lists);
    }
}
