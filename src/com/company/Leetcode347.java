package com.company;

import javax.swing.*;
import java.util.*;

public class Leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });

        for (Integer key : map.keySet()) {
            if(q.size() < k){
                q.add(key);
            }else if(map.get(key) > map.get(q.peek())){
                q.remove();
                q.add(key);
            }
        }

        //List<Integer> res = new ArrayList<>();
        int[] res = new int[k];
        for(int i =0; i< k; i++){
            res[i] = q.remove();
        }
        return res;

    }
}
