package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Leetcode210 {

    List<List<Integer>> edges;
    int[] visited;
    boolean valid = true;

    int[] res;
    int idx;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for(int i =0; i< numCourses; i++){
            edges.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        res = new int[numCourses];
        idx = numCourses -1;
        for (int[] pq : prerequisites) {
            edges.get(pq[1]).add(pq[0]);
        }
        for(int i=0; i<numCourses; i++){
            if(!valid){
                return new int[0];
            }
            if(visited[i] == 0){
                dfs(i);
            }
        }
        return res;
    }

    public void dfs(int n){
        visited[n] = 1;
        for (Integer v : edges.get(n)) {
            if(visited[v] ==0){
                res[idx] = n;
                idx = idx +1;
                dfs(v);
                if(!valid){
                    return;
                }
            }else if(visited[v] ==1){
                valid = false;
                return;
            }
        }
        visited[n] = 2;
        res[idx--] = n;
    }

    public static void main(String[] args) {
        int[][] testData = new int[][]{{1,0}};
        int[] order = new Leetcode210().findOrder(2, testData);
        System.out.println(order);
    }
}
