package me.bm;

import java.util.LinkedList;
import java.util.Stack;

public class BM77 {
    public int longestValidParentheses (String s) {

        int result = 0;
        if (s == null || s.length() <= 1) {
            return 0;
        }
        int last = -1;
        Stack<Integer> stack = new Stack<Integer>();
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '(') {
                stack.push(i);
            } else {
                //chs[i] == ')'
                if (stack.isEmpty()) {
                    //stack.push(chs[i]);
                    last = i;
                } else {
                    stack.pop();
                    if(stack.isEmpty()){
                        result = Math.max(result, i - last);
                    }else{
                        result = Math.max(result, i - stack.peek());
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new BM77().longestValidParentheses(")()(()()((((((())(");
        System.out.println(i);
    }
}
