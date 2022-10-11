package me.nextJourney;

import com.company.Leetcode199;
import me.nextJourney.base.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode199 {

    public List<Integer> rightSideView(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        //层序遍历
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i< len; i++){
                TreeNode pop = queue.pollFirst();
                if(pop.left != null){
                    queue.add(pop.left);
                }
                if(pop.right != null){
                    queue.add(pop.right);
                }
                if(i == len-1){
                    result.add(pop.val);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //new Leetcode199().rightSideView()
    }


}
