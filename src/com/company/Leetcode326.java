package com.company;

public class Leetcode326 {
    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        while(n%3 == 0){
            n = n/3;
        }
        if(n == 1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int testNum = 3;
        boolean powerOfThree = new Leetcode326().isPowerOfThree(testNum);
        System.out.println(powerOfThree);
    }
}
