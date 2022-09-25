package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode264 {

    public int nthUglyNumber(int n) {
        if(n < 1){
            return -1;
        }
        if(n == 1){
            return 1;
        }
        int idx = 0;
        int x2Point =0, x3Point =0, x5Point = 0;
        List<Integer> numPool = new ArrayList<>();
        numPool.add(1);
        while(true){
            int temp = Math.min(numPool.get(x2Point)*2, Math.min(numPool.get(x3Point)*3, numPool.get(x5Point)*5));
            numPool.add(temp);
            if(temp == numPool.get(x2Point)*2){
                x2Point = x2Point +1;
            }
            if(temp == numPool.get(x3Point)*3){
                x3Point = x3Point +1;
            }
            if(temp == numPool.get(x5Point)*5){
                x5Point = x5Point +1;
            }
            if(numPool.size() == n){
                return numPool.get(n-1);
            }
        }
    }
}
