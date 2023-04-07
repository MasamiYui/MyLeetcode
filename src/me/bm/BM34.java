package me.bm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BM34 {
    public boolean isValidBST (TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        int pre = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)< pre){
                return false;
            }
            pre = list.get(i);
        }
        return true;
    }

    public void dfs(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
    }
}
