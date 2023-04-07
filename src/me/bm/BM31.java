package me.bm;

public class BM31 {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null){
            return true;
        }
        return dfs(pRoot.left, pRoot.right);
    }

    boolean dfs(TreeNode leftTree, TreeNode rightTree){
        if(leftTree == null && rightTree == null){
            return true;
        }
        if(leftTree == null && rightTree != null){
            return false;
        }
        if(leftTree != null && rightTree == null){
            return false;
        }
        if(leftTree.val != rightTree.val){
            return false;
        }
        return dfs(leftTree.left, rightTree.right) && dfs(leftTree.right, rightTree.left);
    }
}
