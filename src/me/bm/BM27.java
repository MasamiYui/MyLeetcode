package me.bm;

import java.util.*;

public class BM27 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        if(pRoot == null){
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        boolean isReverse = false;
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
            if(isReverse){
                Collections.reverse(subResult);
            }
            result.add(subResult);
            isReverse = !isReverse;
        }

        return result;
    }
}
