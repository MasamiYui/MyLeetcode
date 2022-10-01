package me.nextJourney;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import me.nextJourney.base.TreeNode;

public class Leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0; i< levelSize; i++){
                TreeNode node = queue.poll();
                subList.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(subList);
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
