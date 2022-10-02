package me.nextJourney;

import me.nextJourney.base.TreeNode;

import java.util.*;

public class Leetcode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        boolean needRotate = false;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> subResult = new ArrayList<>();
            int tempSize = queue.size();
            for(int i=0; i<tempSize; i++){
                TreeNode poll = queue.poll();
                if(poll.left != null) {
                    queue.add(poll.left);
                }
                if(poll.right != null){
                    queue.add(poll.right);
                }
                subResult.add(poll.val);
            }
            if(needRotate){
                Collections.reverse(subResult);
            }
            result.add(subResult);
            needRotate = !needRotate;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
