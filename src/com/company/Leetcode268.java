package com.company;

import java.util.Collections;
import java.util.HashSet;

public class Leetcode268 {
    public int missingNumber(int[] nums) {

        HashSet set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        for(int i =0; i<nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return nums.length;
    }
}
