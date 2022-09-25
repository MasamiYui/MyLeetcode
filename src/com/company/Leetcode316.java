package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Leetcode316 {
    public String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26];
        for(int i =0; i< s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] exist = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();
        stack.addLast('a');
        char[] chars = s.toCharArray();
        for (int i =0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if(exist[ch-'a']){
                continue;
            }
            while(stack.peekLast() > ch && lastIndex[stack.getLast()-'a']> i){
                char c= stack.removeLast();
                exist[c- 'a'] = false;// reset false
            }
            stack.addLast(ch);
            exist[ch - 'a'] = true;
        }
        StringBuffer sb = new StringBuffer();
        stack.removeFirst();
        while(!stack.isEmpty()){
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        String testData = "bcabc";
        String res = new Leetcode316().removeDuplicateLetters(testData);
        System.out.println(res);
    }
    
}
