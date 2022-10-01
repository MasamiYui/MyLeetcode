package me.nextJourney;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Leetcode20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        List<Character> leftChar = Arrays.asList(new Character[]{'(', '[', '{'});
        //List<Character> rightChar = Arrays.asList(new Character[]{')', ']', '}'});
        for (char c : chars) {
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                Character peek = stack.peek();
                if(leftChar.contains(c)){//c是左括号
                    if(leftChar.contains(peek)){//peek是左括号
                        stack.push(c);
                    }else{
                        return false;
                    }
                }else{
                    if( (c == ')' && peek =='(') || (c == ']' && peek == '[') || (c == '}' && peek == '{') ){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = new Leetcode20().isValid("(]");
        System.out.println(result);
    }
}
