package me.nextJourney;

import me.nextJourney.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-preorder-traversal/
 */
public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result) {
        if(root == null){
            return;
        }
        result.add(root.val);
        dfs(root.left, result);
        dfs(root.right, result);
    }
}
