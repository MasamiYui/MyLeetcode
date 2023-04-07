package me.bm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.nowcoder.com/practice/5e2135f4d2b14eb8a5b06fab4c938635?tpId=295&tqId=2291302&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 */
public class BM23 {
    public int[] preorderTraversal (TreeNode root) {

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
        res.add(node.val);
        dfs(node.left, res);
        dfs(node.right, res);
    }



}
