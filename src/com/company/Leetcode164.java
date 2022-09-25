package com.company;

import java.util.Arrays;

public class Leetcode164 {
    public int maximumGap(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        int n = nums.length;

        int max = -1;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<nums.length; i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        if(max - min ==0){
            return 0;
        }

        int[] bucketMin = new int[n-1];
        int[] bucketMax = new int[n-1];
        Arrays.fill(bucketMax, -1);
        Arrays.fill(bucketMin, Integer.MAX_VALUE);

        int interval = (int) Math.ceil((double)(max- min)/(n-1));

        for(int i=0; i<nums.length; i++){
            int id = (nums[i]- min) / interval;
            if(nums[i] == min || nums[i] == max){
                continue;
            }

            bucketMax[id] = Math.max(bucketMax[id], nums[i]);
            bucketMin[id] = Math.min(bucketMin[id], nums[i]);
        }

        int maxGap =0;
        int previousMax = min;
        for(int i =0; i<n-1; i++){
            if(bucketMax[i] == -1){
                continue;
            }

            maxGap = Math.max(bucketMin[i]- previousMax, maxGap);
            previousMax = bucketMax[i];
        }

        maxGap = Math.max(maxGap, max- previousMax);
        return maxGap;


    }
}
