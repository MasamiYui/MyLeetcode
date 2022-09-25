package com.company;

import java.util.HashSet;
import java.util.Set;

public class Leetcode287 {
    public int findDuplicate(int[] nums) {
        int res = 0;
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }

    public static void main(String[] args) {
        int[] testData = new int[]{4,3,1,4,2};
        int duplicate = new Leetcode287().findDuplicate(testData);
        System.out.println(duplicate);
    }
}
