package me.nextJourney;

import me.nextJourney.base.TreeNode;

public class LeetCode124 {

    int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        result = Integer.MIN_VALUE;
        if(root == null){
            return 0;
        }
        getMaxPath(root);

        return result;
    }

    public int getMaxPath(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = Math.max(getMaxPath(root.left), 0);
        int right = Math.max(getMaxPath(root.right), 0);
        result = Math.max(left+right+ root.val, result);
        return root.val + Math.max(left, right);
    }
}
