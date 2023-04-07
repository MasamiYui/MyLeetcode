package me.bm;

import java.util.LinkedList;
import java.util.Queue;

public class BM35 {
    public boolean isCompleteTree (TreeNode root) {
        // write code here
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null){
                if(queue.peek() != null){
                    return false;
                }
            }else{
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }
}
