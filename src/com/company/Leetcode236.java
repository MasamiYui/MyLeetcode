package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Leetcode236 {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root ==p || root ==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);
        if(left != null && right != null){
            return root;
        }else if(left != null){
            return left;
        }else{
            return right;
        }
    }


}
