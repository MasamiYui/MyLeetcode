package com.company;

public class Leetcode222 {
    public int countNodes(TreeNode root) {

        int height = getHeight(root);
        if(height == 0 || height ==1){
            return height;
        }

        if(getHeight(root.right) == height -1){
            return (int)(Math.pow(2 , height-1)) + countNodes(root.right);
        }else{
            return (int)(Math.pow(2, height-2)) + countNodes(root.left);
        }
    }

    public int getHeight(TreeNode root){
        return root == null? 0:1+getHeight(root.left);
    }

}
