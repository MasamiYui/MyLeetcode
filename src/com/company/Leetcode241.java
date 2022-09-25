package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode241 {
    Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String input) {

        List<Integer> res = new ArrayList<>();
        if(map.containsKey(input)){
            return map.get(input);
        }
        for(int i =0; i< input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '+' || ch == '-' || ch== '*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for(int x : left){
                    for(int y: right){
                        if(ch == '+'){
                            res.add(x+y);
                        }
                        if(ch == '-'){
                            res.add(x-y);
                        }
                        if(ch == '*'){
                            res.add(x*y);
                        }
                    }
                }
            }
        }
        if(res.size() == 0)
            res.add(Integer.valueOf(input));
        map.put(input, res);
        return res;
    }

    public static void main(String[] args) {

    }
}
