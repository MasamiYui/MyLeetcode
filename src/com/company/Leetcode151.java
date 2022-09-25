package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Leetcode151 {

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

    public static void main(String[] args) {
        String testStr = "  hello world!  ";
        String s = new Leetcode151().reverseWords(testStr);
        System.out.println(s);
    }
}
