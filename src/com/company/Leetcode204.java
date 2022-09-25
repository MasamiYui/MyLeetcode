package com.company;

import java.util.Arrays;

public class Leetcode204 {
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrim[i]) {
                for (int j = i * i; j < n; j+=i) {
                    isPrim[j] = false;
                }
            }
        }
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (isPrim[i]) {
                res++;
            }
        }
        return res;
    }
}
