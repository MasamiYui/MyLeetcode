package me.nextJourney;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class LeetCode151 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            word = word.trim();
            if(word.length() >0){
                stack.push(word);
            }
        }
        String res = "";
        while(!stack.isEmpty()){
            res = res + stack.pop() + " ";
        }
        return res.trim();

    }


}
