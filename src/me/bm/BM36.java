package me.bm;

public class BM36 {

    public boolean IsBalanced_Solution(TreeNode root) {

        if(root == null){
            return true;
        }
        int leftDept = getDept(root.left);
        int rightDept = getDept(root.right);
        System.out.println("root.val:"+root.val + "leftDept:"+leftDept + "rightDept:"+rightDept);
        if(Math.abs(leftDept - rightDept) > 1){
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

    }

    int getDept(TreeNode node){
        if(node == null){
            return 0;
        }
        if(node.left != null && node.right == null){
            return 1+ getDept(node.left);
        }
        if(node.left == null && node.right != null){
            return 1 + getDept(node.right);
        }
        return Math.max(getDept(node.left), getDept(node.right)) + 1;
    }
}
