package com.company;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Leetcode220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer s = set.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t) return true;
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= (long)g + t) return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * [2147483640,2147483641]
         * 1
         * 100
         */

        boolean b = new Leetcode220().containsNearbyAlmostDuplicate(new int[]{2147483640, 2147483641}, 1, 100);
        System.out.println(b);
    }
}
