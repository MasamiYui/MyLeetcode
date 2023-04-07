package me.bm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BM26 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> subResult= new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode poll = queue.poll();
                subResult.add(poll.val);
                if(poll.left != null){
                    queue.add(poll.left);
                }
                if(poll.right != null){
                    queue.add(poll.right);
                }
            }
            result.add(subResult);
        }

        return result;
    }


}
