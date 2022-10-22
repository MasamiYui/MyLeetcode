package me.nextJourney;

import me.nextJourney.base.TreeNode;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }else{
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }

    }

}
