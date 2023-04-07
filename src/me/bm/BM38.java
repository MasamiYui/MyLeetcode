package me.bm;

public class BM38 {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        TreeNode treeNode = find(root, o1, o2);
        return treeNode.val;
    }

    public TreeNode find (TreeNode root, int o1, int o2){
        if(root == null){
            return null;
        }
        if(root.val == o1 || root.val == o2){
            return root;
        }
        TreeNode left = find(root.left, o1, o2);
        TreeNode right = find(root.right, o1, o2);
        if(left != null && right != null){
            return root;
        }
        if(left == null){
            return right;
        }
        return left;

    }
}
