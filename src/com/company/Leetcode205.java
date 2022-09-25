package com.company;

import java.util.HashMap;
import java.util.Map;

public class Leetcode205 {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        int len1 = s.length();
        int len2= s.length();
        if(len1 != len2){
            return false;
        }
        for(int i =0; i< len1; i++){
            Character ch1 = s.charAt(i);
            Character ch2 = t.charAt(i);
            if(!map.containsKey(ch1) && map.containsValue(ch2)){
                return false;
            }else if(map.containsKey(ch1) && (map.get(ch1) != ch2)){
                return false;
            }else{
                map.put(ch1, ch2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = new Leetcode205().isIsomorphic("ab", "aa");
        System.out.println(res);

    }
}
