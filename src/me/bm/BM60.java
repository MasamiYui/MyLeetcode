package me.bm;

import java.util.ArrayList;

public class BM60 {
    public ArrayList<String> generateParenthesis (int n) {
        ArrayList<String> res= new ArrayList<>();
        dfs(n, 0, 0 ,"", res);
        return res;
    }

    public void dfs(int n, int left ,int right, String subStr, ArrayList<String> res){
        if(left > n || right > n){
            return;
        }
        if(left<right){
            return;
        }
        if(left ==n && right ==n){
            res.add(subStr);
            return;
        }
        dfs(n, left+1, right, subStr+"(" , res);
        dfs(n, left, right+1, subStr+")", res);
    }


}
