package me.bm;

import java.util.ArrayList;
import java.util.Arrays;

public class BM58 {
    public ArrayList<String> Permutation(String str) {

        boolean[] visited = new boolean[str.length()];
        ArrayList<String> res = new ArrayList<>();
        char[] cs = str.toCharArray();
        Arrays.sort(cs);
        StringBuilder sb = new StringBuilder();
        dfs(cs, visited, sb, res);
        return res;
    }

    public void dfs(char[] cs, boolean[] visited, StringBuilder sb, ArrayList<String> res){
        if(sb.length() == cs.length){
            res.add(sb.toString());
            return;
        }
        for(int i=0; i<cs.length; i++){
            if(visited[i]){
                continue;
            }
            if(i > 0 && cs[i - 1] == cs[i] && !visited[i - 1]){
                continue;
            }
            visited[i] = true;
            dfs(cs, visited, sb.append(cs[i]), res);
            visited[i] = false;
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> ab = new BM58().Permutation("ab");
        System.out.println(ab);
    }
}
