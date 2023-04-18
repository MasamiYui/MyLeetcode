package me.bm;

import java.util.HashMap;
import java.util.Map;

public class BM90 {
    public String minWindow (String s, String t) {
        // write code here
        Map<Character, Integer> need = new HashMap();
        for(int i=0; i<t.length(); i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int left =0 ;
        int right = 0;
        int start = left;
        int len = Integer.MAX_VALUE;
        int valid = 0;
        while(right < s.length()){
            char rc = s.charAt(right++);
            if(need.containsKey(rc)){
                window.put(rc, window.getOrDefault(rc, 0)+ 1);
                if(window.get(rc).equals(need.get(rc))){
                    valid++;
                }
            }
            while(valid == need.size()){
                if(len > right - left){
                    len = right - left;
                    start = left;
                }
                char lc = s.charAt(left++);
                if(need.containsKey(lc)){
                    if(window.get(lc).equals(need.get(lc))){
                        valid--;
                    }
                    window.put(lc, window.getOrDefault(lc, 0) -1);
                }
            }
        }

        return len == Integer.MAX_VALUE? "": s.substring(start, start + len);
    }
    public static void main(String[] args) {
        
    }
}
