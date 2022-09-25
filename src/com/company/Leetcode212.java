package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Leetcode212 {


    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            insert(trie, word);
        }
        List<String> res= new ArrayList<>();
        int n = board.length;
        int m= board[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                StringBuilder sb = new StringBuilder();
                dfs(board, i, j, trie.children[board[i][j] - 'a'], res, visited, sb);
            }
        }
        return res;
    }


    public void dfs(char[][] board, int x, int y, Trie root, List<String> res, boolean[][] visited, StringBuilder sb){
        if(root == null){
            return;
        }
        sb.append(board[x][y]);
        if(root.isWord){
            res.add(sb.toString());
            root.isWord = false;
        }
        visited[x][y] = true;
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<dx.length; i++){
            int nx = x +dx[i];
            int ny = y + dy[i];
            if(nx >=0 && nx<n && ny>=0 && ny <=m && !visited[nx][ny]){
                int idx = board[nx][ny] -'a';
                dfs(board,nx, ny, root.children[idx], res, visited, sb);
            }
        }
        sb.setLength(sb.length() -1);


        visited[x][y] = false;
    }


    public void insert(Trie root, String s){
        Trie cur = root;
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(cur.children[idx] == null){
                cur.children[idx] = new Trie();
            }
            cur = cur.children[idx];
        }
        cur.isWord = true;
    }


    class Trie{
        boolean isWord;
        Trie[] children;
        Trie(){
            isWord = false;
            children = new Trie[26];
        }

    }

    public static void main(String[] args) {

    }
}


