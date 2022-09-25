package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> listP = new ArrayList<>();
        List<TreeNode> listQ = new ArrayList<>();
        dfs(listP, root, p);
        dfs(listQ, root, q);
        TreeNode res = root;
        boolean flag = false;
        int len = Math.min(listP.size(), listQ.size());
        for(int i =0; i<len; i++){
            if(listP.get(i).val == listQ.get(i).val){
                res = listP.get(i);
            }else{
                break;
            }
        }
        return res;
    }

    public void dfs(List<TreeNode> list, TreeNode root, TreeNode node){
        list.add(root);
        if(root.val == node.val){
            return;
        }
        if(node.val > root.val){
            dfs(list, root.right, node);
        }
        if(node.val < root.val){
            dfs(list, root.left, node);
        }
    }


    public static void main(String[] args) {

    }
}
