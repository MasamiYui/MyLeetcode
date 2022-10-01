package me.nextJourney;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(nums[i] * 2 == target){
                    result[0] = i;
                    result[1] = map.get(nums[i]);
                    return result;
                }
            }else{
                map.put(nums[i], i);
            }
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left <right){
            int temp = nums[left] + nums[right];
            if(temp == target){
                result[0] = map.get(nums[left]);
                result[1] = map.get(nums[right]);
                break;
            }else if(temp < target){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = new Leetcode1().twoSum(nums, target);
        for (int i : result) {
            System.out.println(result[i]);
        }

    }
}
