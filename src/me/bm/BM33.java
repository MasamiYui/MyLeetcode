package me.bm;

public class BM33 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null){
            return null;
        }
        TreeNode left=Mirror(pRoot.left);
        TreeNode right=Mirror(pRoot.right);
        pRoot.left=right;
        pRoot.right=left;
        return pRoot;
    }

}
