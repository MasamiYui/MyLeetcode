package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Leetcode257 {
    List<String> res;

    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        String subRes = "";
        dfs(root, subRes);
        return res;
    }

    public void dfs(TreeNode root, String subRes){
        if(root != null){
            subRes = subRes + root.val;
            if(root.left == null && root.right == null){
                res.add(subRes);
            }else{
                subRes = subRes + "->";
                dfs(root.left,subRes);
                dfs(root.right,subRes);
            }
        }

    }
}
