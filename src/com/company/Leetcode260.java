package com.company;

import java.util.HashMap;
import java.util.Map;

public class Leetcode260 {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res= new int[2];
        int idx = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0) +1);
        }
        for (Integer key : map.keySet()) {
            int times = map.get(key);
            if(times == 1){
                res[idx++] = key;
                if(idx == 2){
                    break;
                }
            }
        }
        return res;
    }
}
