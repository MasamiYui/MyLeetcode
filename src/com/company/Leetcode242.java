package com.company;

import java.util.HashMap;
import java.util.Map;

public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (char sChar : sChars) {
            sMap.put(sChar, sMap.getOrDefault(sChar,0)+1);
        }
        for (char tChar : tChars) {
            Integer num = sMap.getOrDefault(tChar,0);
            if(num == 0){
                return false;
            }else{
                sMap.put(tChar, num-1);
            }
        }
        return true;
    }
}
