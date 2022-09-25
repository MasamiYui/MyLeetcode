package com.company;

import javax.swing.plaf.IconUIResource;

public class Leetcode172 {

    public int trailingZeroes(int n) {
        int res = 0;
        while (n >=5){
            n = (int)Math.ceil((n/5));
            res = res + n;
        }
        return res;
    }
}
