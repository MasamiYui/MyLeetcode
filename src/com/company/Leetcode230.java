package com.company;

public class Leetcode230 {

    int idx = 0;
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {

        dfs(root, k);
        return res;
    }

    public void dfs(TreeNode root, int k){
        if(root.left != null){
            dfs(root.left,k);
        }
        idx++;
        if(idx >k){
            return;
        }
        if(idx == k){
            res = root.val;
            return;
        }
        if(root.right != null){
            dfs(root.right, k);
        }
    }
}
