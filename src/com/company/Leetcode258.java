package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode258 {

    boolean flag = false;
    int res;
    public int addDigits(int num) {

        while (num > 10){
            num = func(num);
        }
        return num;
    }

    public int func(int num){
        int res;
        if(num < 10){
            return num;
        }else{
            List<Integer> sub  = new ArrayList<>();
            while (num > 10){
               sub.add(num%10);
               num = num/10;
            }
            sub.add(num);
            res = sub.stream().mapToInt(n -> n).sum();
        }
        return res;
    }


    public static void main(String[] args) {
        int res = new Leetcode258().func(38);
        System.out.println(res);
    }
}
