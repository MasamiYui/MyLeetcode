package me.bm;


import java.util.HashSet;
import java.util.Set;

public class BM59 {

    Set<Integer> rowSet = new HashSet<>();
    Set<Integer> pie = new HashSet<>();
    Set<Integer> na = new HashSet<>();
    int res = 0;
    public int Nqueen (int n) {
        // write code here
        res = 0;
        dfs(n, 0);
        return res;
    }

    private void dfs( int n, int k) {
        if(n == k){
            res++;
            return;
        }
        for(int i=0; i<n; i++){
            if(rowSet.contains(i) || pie.contains(k+i) || na.contains(k-i)){
                continue;
            }
            //data[k][i] = true;
            rowSet.add(i);
            pie.add(k+i);
            na.add(k-i);
            dfs(k+1, n);
            rowSet.remove(i);
            pie.remove(k+i);
            na.remove(k-i);
            //data[k][i] = false;
        }
    }
}
