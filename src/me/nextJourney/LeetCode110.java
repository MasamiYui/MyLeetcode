package me.nextJourney;

import me.nextJourney.base.TreeNode;

public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }else{
            return Math.abs(getDept(root.left) - getDept(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }


    public int getDept(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1 + Math.max(getDept(root.left) , getDept(root.right));
        }
    }


}
