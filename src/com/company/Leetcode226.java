package com.company;

public class Leetcode226 {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }



}
