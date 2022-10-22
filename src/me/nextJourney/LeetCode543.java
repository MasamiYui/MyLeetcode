package me.nextJourney;

import me.nextJourney.base.TreeNode;

public class LeetCode543 {

    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        result = 0;
        getMaxPart(root);
        return result-1;
    }

    public int getMaxPart(TreeNode root){
        if(root == null){
            return 0;
        }else {
            int left = getMaxPart(root.left) ;
            int right = getMaxPart(root.right);
            result = Math.max(left + right+1, result);
            return Math.max(left, right) + 1;
        }
    }
}
