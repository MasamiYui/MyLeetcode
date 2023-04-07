package me.bm;

public class BM32 {
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        TreeNode result = null;
        merge(t1, t2);
        return t1;
    }

    public TreeNode merge(TreeNode t1, TreeNode t2){

        if(t1 == null && t2 == null){
            return null;
        }
        if(t1 != null && t2 == null){
            return t1;
        }
        if(t1 ==null && t2 != null){
            return t2;
        }
        t1.val += t2.val;
        t1.left = merge(t1.left, t2.left);
        t1.right = merge(t1.right, t2.right);
        return t1;
    }

}
