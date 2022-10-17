package me.nextJourney;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    public List<String> generateParenthesis(int n) {

        List<String >result = new ArrayList<>();
        int left = n;
        int right = n;
        dfs(left, right, "", result);
        return result;
    }

    public void dfs(int left , int right, String subStr, List<String> result){
        if(left > right){
            return;
        }
        if(left == 0){
            subStr = subStr + generate(')', right);
            result.add(subStr);
            return;
        }else if(right == 0){
            subStr = subStr + generate(')', left);
            result.add(subStr);
            return;
        }else{
            if(subStr.length() == 0){
                dfs(left-1, right, subStr+'(' , result);
                return;
            }
            char c = subStr.charAt(subStr.length() - 1);
            dfs(left-1, right, subStr+'(' , result);
            dfs(left, right-1, subStr + ')', result);
        }
    }

    public String generate(char c, int n){
        StringBuilder sb  = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> res = new LeetCode22().generateParenthesis(3);
        System.out.println(res);
    }
}
