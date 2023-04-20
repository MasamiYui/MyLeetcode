package me.bm;

import java.util.ArrayList;
import java.util.Arrays;

public class BM56 {

    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> track = new ArrayList<>();
        boolean []visited = new boolean[num.length];
        Arrays.sort(num);
        backtrack(num,res,track, visited);
        return res;
    }

    public void backtrack(int[] num, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subRes, boolean []visited){
        if(subRes.size() == num.length){
            res.add(new ArrayList<Integer>(subRes));
            return;
        }
        for(int i = 0; i < num.length; i++){

            if(visited[i] || i>0 && num[i] == num[i-1] && !visited[i-1]){
                continue;
            }
            subRes.add(num[i]);
            visited[i] = true;
            backtrack(num,res,subRes, visited);
            subRes.remove(subRes.size()-1);
            visited[i] = false;
        }
    }
}
