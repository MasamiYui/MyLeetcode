package me.nextJourney;

import me.nextJourney.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        dfs(root, 0, new ArrayList<>(), targetSum, result);
        return result;
    }

    public void dfs(TreeNode root, int localSum,  List<Integer> localArr, int targetSum, List<List<Integer>>result){
        if(root == null){
            return;
        }
        localSum = localSum + root.val;
        localArr.add(root.val);
        if(localSum == targetSum && root.left == null && root.right == null){
            result.add(new ArrayList<>(localArr));
        }
        dfs(root.left, localSum, localArr, targetSum, result);
        dfs(root.right, localSum, localArr, targetSum, result);
        localArr.remove(localArr.size() - 1);
    }
}
