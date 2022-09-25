package com.company;


public class Leetcode106 {





    public TreeNode buildTree(int[] inorder, int[] postorder) {


        return buildTree(inorder,0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public TreeNode buildTree(int[] inOrder, int inStart, int inEnd, int[] postorder, int poStart, int poEnd){
        if(inStart > inEnd){
            return null;
        }
        if(inStart == inEnd){
            return new TreeNode(inOrder[inStart]);
        }
        TreeNode root = new TreeNode(postorder[poEnd]);
        int rootIndexInOrder = inStart;
        while(true){
            //find inOrder split
            if(inOrder[rootIndexInOrder] == root.val){
                break;
            }
            rootIndexInOrder++;
        }
        int leftSubNumber = rootIndexInOrder -inStart;
        root.left = buildTree(inOrder, inStart, rootIndexInOrder-1, postorder, poStart, poStart+leftSubNumber -1);
        root.right = buildTree(inOrder, rootIndexInOrder+1, inEnd,  postorder, poStart+leftSubNumber, poEnd-1);
        return root;
    }

    public static void main(String[] args) {

        TreeNode treeNode = new Leetcode106().buildTree(new int[]{1, 2, 3, 4}, new int[]{3, 2, 4, 1});
        System.out.println(treeNode);
    }
}
