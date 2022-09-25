package com.company;

public class Leetcode306 {
    public boolean isAdditiveNumber(String num) {

        return backTrace(num, 0,0,0,0);

    }

    public  boolean backTrace(String num, int idx, long sum, long pre, int nNum) {
        if (idx == num.length()) {
            return nNum > 2;
        }
        long tValue = 0;
        for (int i = idx; i < num.length(); i++) {
            //select num
            if (i > idx && num.charAt(idx) == '0') {
                break;
            }
            tValue = 10 * tValue + (num.charAt(i) - '0');
            if (nNum >= 2) {
                if (tValue < sum) {
                    continue;
                }
                if (tValue > sum) {
                    break;
                }
            }
            if (backTrace(num, i + 1, tValue + pre, tValue, nNum + 1)) {
                return true;
            }
        }
        return false;
    }


    public  boolean backTrace2(String num, int idx, long sum, long pre, int nNum) {
        if (idx == num.length()) {
            return nNum > 2;
        }
        long tValue = 0;
        for (int i = idx; i < num.length(); i++) {
            if (i > idx && num.charAt(idx) == '0') {
                break;
            }
            tValue = tValue * 10 + num.charAt(i) - '0';
            if (nNum >= 2) {
                if (tValue < sum) {
                    continue;
                }
                if (tValue > sum) {
                    break;
                }
            }
            if (backTrace2(num,i + 1, pre + tValue, tValue, nNum + 1)) {
                return true;
            }
        }
        return false;
    }

}
