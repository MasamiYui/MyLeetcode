package me.nextJourney;

import me.nextJourney.base.ListNode;
import me.nextJourney.base.TreeNode;

import javax.swing.plaf.ListUI;
import java.util.Arrays;

public class LeetCode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0 || preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if(preorder[0] == inorder[i]){
                root.left = buildTree(Arrays.copyOfRange(preorder, 1, i+1), Arrays.copyOfRange(inorder, 0, i));
                root.right = buildTree(Arrays.copyOfRange(preorder, i+1, preorder.length), Arrays.copyOfRange(inorder, i+1, preorder.length));
            }
        }
        return root;
    }

}
