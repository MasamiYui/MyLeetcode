package me.nextJourney;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        trackBack(candidates, target, new ArrayList<>(), 0,0, result);
        return result;
    }

    public void trackBack(int[] candidates, int target, List<Integer> path, int idx, int localSum, List<List<Integer>> result){
        if(localSum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        if(localSum > target){
            return;
        }
        for(int i=idx; i<candidates.length; i++){
            //localSum = localSum + candidates[i];
            path.add(candidates[i]);
            trackBack(candidates, target, path, i, localSum + candidates[i], result);
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        //[2,3,6,7] 7
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = new LeetCode39().combinationSum(candidates, target);
        System.out.println(lists);

    }
}
