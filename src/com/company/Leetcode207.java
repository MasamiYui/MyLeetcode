package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Leetcode207 {

    List<List<Integer>> edges;
    int[] visited;
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for(int i =0; i< numCourses; i++){
            edges.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        for (int[] pq : prerequisites) {
            edges.get(pq[1]).add(pq[0]);
        }
        for(int i=0; i<numCourses; i++){
            if(!valid){
                break;
            }
            if(visited[i] == 0){
                dfs(i);
            }
        }
        return valid;
    }

    public void dfs(int n){
        visited[n] = 1;
        for (Integer v : edges.get(n)) {
            if(visited[v] ==0){
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
    }

    public static void main(String[] args) {

    }
}
