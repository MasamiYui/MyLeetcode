package me.nextJourney;

import me.nextJourney.base.TreeNode;

public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {

        dfs(root);
        return root;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;
        dfs(root.left);
        dfs(root.right);
    }
}
