package me.bm;

import java.util.HashMap;
import java.util.HashSet;

public class BM50 {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            if(map.get(target-numbers[i]) != null){
                return new int[]{map.get(target-numbers[i])+1, i+1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
