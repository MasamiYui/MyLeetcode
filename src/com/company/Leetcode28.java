package com.company;

public class Leetcode28 {

    public int strStr(String haystack, String needle) {

        for(int i=0; i<= haystack.length() - needle.length(); i++){
            int j =0;
            for(j =0 ; j< needle.length(); j++){
                if(haystack.charAt(i +j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {

    }
}
