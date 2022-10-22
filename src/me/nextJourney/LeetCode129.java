package me.nextJourney;

import me.nextJourney.base.TreeNode;

import java.beans.PropertyEditorSupport;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LeetCode129 {
    public int sumNumbers(TreeNode root) {

        int[] result = new int[1];
        result[0] = 0;
        dfs(root, new ArrayList(), result);
        return result[0];
    }

    public void dfs(TreeNode root, List<Integer> temp, int[] result){
        temp.add(root.val);
        if(root.left == null && root.right == null){
            result[0] = result[0] + toInt(temp);
            return;
        }
        if(root.left != null){
            dfs(root.left, new ArrayList<>(temp),result);
        }
        if(root.right != null){
            dfs(root.right, new ArrayList<>(temp), result);
        }
    }

    public int toInt(List<Integer> list){
        int result = 0;
        for(int i=0; i< list.size(); i++){
            result =result * 10 + list.get(i);
        }
        return result;
    }
}
