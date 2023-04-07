package me.bm;

import java.util.ArrayList;
import java.util.List;

public class BM37 {

    int result = Integer.MIN_VALUE;
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        if(p<root.val && q<root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(p>root.val && q>root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root.val;
    }

}
