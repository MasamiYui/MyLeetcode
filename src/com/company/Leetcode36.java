package com.company;

import java.util.HashMap;
import java.util.Map;

public class Leetcode36 {

    public static void main(String[] args) {



    }

    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Integer>[] rows = new HashMap[9];
        Map<Integer, Integer>[] columns = new HashMap[9];
        Map<Integer, Integer>[] subs = new HashMap[9];
        for(int i =0; i<9; i++){
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            subs[i] =new HashMap<>();
        }

        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                char num = board[i][j];
                if(num != '.'){
                    int n = Integer.valueOf(num);
                    int subIdx = (i / 3 ) * 3 + j / 3;
                    rows[i].put(n, rows[i].getOrDefault(n, 0)+1);
                    columns[i].put(n, columns[j].getOrDefault(n, 0)+1);
                    subs[subIdx].put(n,subs[subIdx].getOrDefault(n, 0)+1);
                    if(rows[i].get(n) > 1 || columns[j].get(n) >1 || subs[subIdx].get(n) >1 ){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
