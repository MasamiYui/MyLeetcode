package com.company;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2190 {

    public int mostFrequent(int[] nums, int key) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key && i+1<=nums.length-1){
                map.put(nums[i+1],map.getOrDefault(nums[i+1], 0)+1);
            }
        }
        int maxTime = 0;
        int result = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() >= maxTime){
                maxTime = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int i = new Leetcode2190().mostFrequent(new int[]{2,1,2,1,2,3}, 2);
        System.out.printf(""+i);
    }
}
