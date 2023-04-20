package me.bm;

import java.util.*;

public class BM52 {
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        map.forEach((k,v)->{
            if(v == 1){
                list.add(k);
            }
        });
        return new int[]{Math.min(list.get(0), list.get(1)), Math.max(list.get(0), list.get(1))};

    }
}
