package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode863 {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<Integer, List<Integer>> edges = new HashMap<>();
        //build graph
        process(root, edges);
        //dfs
        List<Integer> result = new ArrayList<>();
        List<Integer> list = edges.get(target.val);
        if(list == null || list.isEmpty()){
            return result;
        }
        List<Integer> contained = new ArrayList<>();
        List<Integer> visited = new ArrayList<>();
        dfs(edges, contained, target.val, 0, k,visited);
        return contained;
    }

    public void dfs(Map<Integer, List<Integer>> edges, List<Integer> contained, int localVal, int level, int k, List<Integer> visited){
        if(level > k){
            return;
        }
        if(visited.contains(localVal)){
            return;
        }
        visited.add(localVal);
        if(k == level){
            contained.add(localVal);
        }
        List<Integer> list = edges.get(localVal);
        if(list == null || list.isEmpty()){
            return;
        }
        for (Integer v : list) {
            List<Integer> visitedClone = new ArrayList<>(visited);
            dfs(edges, contained, v, level+1, k, visitedClone);
        }
    }

    void process(TreeNode node, Map<Integer, List<Integer>> edges){
        if(node == null){
            return;
        }
        List<Integer> list = edges.getOrDefault(node.val, new ArrayList<>());
        if(node.left != null){
            list.add(node.left.val);
            List<Integer> leftList = edges.getOrDefault(node.left.val, new ArrayList<>());
            leftList.add(node.val);
            edges.put(node.left.val, leftList);
        }
        if(node.right != null){
            list.add(node.right.val);
            List<Integer> rightList = edges.getOrDefault(node.right.val, new ArrayList<>());
            rightList.add(node.val);
            edges.put(node.right.val, rightList);
        }
        edges.put(node.val, list);
        process(node.left, edges);
        process(node.right, edges);
    }
}
