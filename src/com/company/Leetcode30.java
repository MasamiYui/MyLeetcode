package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode30 {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> res = new ArrayList<>();
        if(words.length == 0){
            return res;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        Map<String, Integer> found = new HashMap<>();
        int n = words.length;
        int len = words[0].length();
        for(int i=0; i<=s.length() - n * len; i++){
            found.clear();
            int j =0;
            for (j=0; j<n; j++){
                String str = s.substring(i+ j*len, i+ j*len+ len);
                if(map.containsKey(str)){
                    found.put(str, found.getOrDefault(str, 0)+1);
                    if(found.get(str) >map.get(str)){
                        break;
                    }
                }else{
                    break;
                }
            }
            if(j == n){
                res.add(i);
            }
        }
        return res;
    }

}
