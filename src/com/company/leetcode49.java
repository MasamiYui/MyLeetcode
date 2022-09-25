package com.company;

import java.util.*;

public class leetcode49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = new char[26];
            Arrays.fill(chars, 'a');
            for(int i =0; i< str.length(); i++){
                chars[str.charAt(i)-97]++;
            }
            String k = String.valueOf(chars);
            if(map.containsKey(k)){
                List<String> list = map.get(k);
                list.add(str);
                map.put(k, list);
            }else{
                List<String> list = new ArrayList();
                list.add(str);
                map.put(k, list);
            }
        }

        List<List<String>> res = new ArrayList<>();
        map.forEach((k,v)->{
            res.add(v);
        });
        return res;
    }


}
