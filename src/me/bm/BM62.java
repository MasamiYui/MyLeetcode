package me.bm;

import java.util.HashMap;
import java.util.Map;

public class BM62 {
    /**
     * 1,1,2,4,6
     * @param n
     * @return
     */
    Map<Integer, Integer> dic;
    public int Fibonacci(int n) {
        dic = new HashMap<>();
        return doFib(n);
    }

    public int doFib(int n){
        if(n <= 2){
            return 1;
        }
        if(dic.containsKey(n)){
            return dic.get(n);
        }
        int res = doFib(n-1) + doFib(n-2);
        dic.put(n, res);
        return res;
    }
}
