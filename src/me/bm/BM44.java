package me.bm;

import java.util.Stack;

public class BM44 {
    public boolean isValid(String s) {
        // write code here
        char[] cs = s.toCharArray();
        if (cs.length == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : cs) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if (c == ')') {
                    if (pop != '(') {
                        return false;
                    }
                }
                if (c == ']') {
                    if (pop != '[') {
                        return false;
                    }
                }
                if (c == '}') {
                    if (pop != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean valid = new BM44().isValid("()");
        System.out.println(valid);
    }
}
