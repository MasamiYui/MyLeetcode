package me.bm;

import java.util.ArrayList;

public class BM55 {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> subResult = new ArrayList<>();
        traceBack(result, subResult, num);
        return result;
    }

    public void traceBack(ArrayList<ArrayList<Integer>> result,
                          ArrayList<Integer> subResult, int[] num){
        if(subResult.size() == num.length){
            result.add(new ArrayList<>(subResult));
            return;
        }
        for(int i=0; i<num.length; i++){
            if(!subResult.contains(num[i])){
                subResult.add(num[i]);
                traceBack(result, subResult, num);
                subResult.remove(subResult.size()- 1);
            }
        }
    }
}
