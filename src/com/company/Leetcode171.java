package com.company;

public class Leetcode171 {

    public int titleToNumber(String s) {

        char[] chs = s.toCharArray();
        int res =0;
        int len = chs.length;
        for(int i =0; i<len; i++){
            res = res + (chs[i]-'A' +1) * (int) Math.pow(26, len -i -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int res = new Leetcode171().titleToNumber("AA");
        System.out.println(res);
    }

}
