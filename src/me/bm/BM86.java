package me.bm;

import java.util.ArrayDeque;
import java.util.Stack;

public class BM86 {
    public String solve (String s, String t) {
        // write code here
        Stack<Integer> stack = new Stack<Integer>();
        if(s == null && s.length() == 0){
            return t;
        }
        if(t == null && t.length() == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        int j = t.length()-1;
        int k = 0;
        while(i >=0 || j>=0 || k != 0){
            k = k + (i>=0?s.charAt(i--) - '0' :0);
            k = k + (j>=0?t.charAt(j--) - '0' :0);
            stack.push(k %10);
            k = k/10;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String solve = new BM86().solve("1", "99");
        System.out.println(solve);
    }
}
