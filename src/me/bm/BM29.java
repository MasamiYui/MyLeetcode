package me.bm;

public class BM29 {

    boolean result = false;
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if(root == null){
            return false;
        }
        result = false;
        dfs(root, 0, sum);
        return result;
    }

    public void dfs(TreeNode node, int localSum, int targetSum){
        if(node.left == null && node.right == null && localSum+node.val == targetSum){
            result = true;
        }
        if(node.left != null){
            dfs(node.left, localSum+node.val, targetSum);
        }
        if(node.right != null){
            dfs(node.right, localSum+ node.val, targetSum);
        }
    }

    public static void main(String[] args) {
        boolean result = new BM29().hasPathSum(null, 1);
        System.out.println(result);
    }
}
