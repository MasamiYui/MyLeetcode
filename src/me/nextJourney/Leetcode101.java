package me.nextJourney;

import me.nextJourney.base.TreeNode;

public class Leetcode101 {
    public boolean isSymmetric(TreeNode root) {

        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 == null && root2 != null){
            return false;
        }else if(root1 != null && root2 == null){
            return false;
        }else if(root1.val != root2.val){
            return false;
        }else{
            return isSame(root1.left, root2.right) && isSame(root1.right, root2.left);
        }
    }
}
