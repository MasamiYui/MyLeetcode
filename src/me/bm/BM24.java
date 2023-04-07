package me.bm;

import java.util.ArrayList;
import java.util.List;

public class BM24 {
    public int[] inorderTraversal (TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        int[] result = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }

    public void dfs(TreeNode node, List<Integer> res){
        if(node == null){
            return;
        }
        if(node.left != null){
            dfs(node.left, res);
        }
        res.add(node.val);
        if(node.right != null){
            dfs(node.right, res);
        }
    }
}
