package me.nextJourney;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> help = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int result = 0;
        for(;right<s.length();right++) {
            char ch = s.charAt(right);
            while(help.contains(ch)) {
                help.remove(s.charAt(left));
                left++;
            }
            help.add(ch);
            result = Math.max(result, right-left+1);
        }
        return result;
    }

    public static void main(String[] args) {
        String testCase = "abcabcbb";
        int result = new Leetcode3().lengthOfLongestSubstring(testCase);
        System.out.println(result);
    }
}
