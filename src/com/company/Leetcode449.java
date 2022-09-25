package com.company;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Leetcode449 {

    String SPLIT =",";
    String NULL = "#";
    public String serialize(TreeNode root) {

        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.removeFirst();
                if(cur == null){
                    sb.append(NULL);
                    sb.append(SPLIT);
                }else{
                    sb.append(cur.val);
                    sb.append(SPLIT);
                }
                if(cur == null){
                    continue;
                }
                queue.addLast(cur.left);
                queue.add(cur.right);
            }
        }
        return sb.substring(0, sb.length()-1).toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if(data.equals("")){
            return null;
        }
        String[] nodes = data.split(SPLIT);
        TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));

        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        for(int i = 1; i < nodes.length;){
            TreeNode parent = queue.removeFirst();
            if(nodes[i].equals(NULL)){
                parent.left = null;
            }else{
                parent.left = new TreeNode(Integer.valueOf(nodes[i]));
                queue.addLast(parent.left);
            }
            if(nodes[i+1].equals(NULL)){
                parent.right = null;
            }else{
                parent.right = new TreeNode(Integer.parseInt(nodes[i+1]));
                queue.addLast(parent.right);
            }
            i = i+2;
        }
        return root;
    }
}
