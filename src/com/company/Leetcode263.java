package com.company;

public class Leetcode263 {


    public boolean isUgly(int num) {
        if(num == 1){
            return true;
        }else if(num % 2 ==0){
            return isUgly(num/6);
        }else if(num % 3 == 0){
            return isUgly(num/3);
        }else if(num % 5 ==0){
            return  isUgly(num/5);
        }else{
            return false;
        }
    }


    public static void main(String[] args) {

    }
}
