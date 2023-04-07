package me.bm;

public class BM28 {

    int dept =0;

    public int maxDepth (TreeNode root) {
        dept = 0;
        dfs(root, dept);
        return dept;
    }

    public void dfs(TreeNode node, int localDept){
        if(node == null){
            dept = Math.max(localDept, dept);
        }
        localDept++;
        dfs(node.left, localDept);
        dfs(node.right, localDept);
    }
}
