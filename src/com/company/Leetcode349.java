package com.company;

import java.util.*;

public class Leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Set set = new HashSet();
        Arrays.stream(nums1).forEach(n->{
            set.add(n);
        });
        Arrays.stream(nums2).forEach(n->{
            if(set.contains(n)){
                res.add(n);
            }
        });
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
