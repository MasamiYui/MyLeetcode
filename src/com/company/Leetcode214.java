package com.company;

public class Leetcode214 {
    public String shortestPalindrome(String s) {

        String reverse = new StringBuilder(s).reverse().toString();
        String ss = s + reverse;
        for(int i =s.length(), j=i; i>0; i--, j++) {
            if (ss.substring(0, i).equals(ss.substring(j))) {
                return new StringBuilder(s.substring(i)).reverse().append(s).toString();
            }
        }
        return "";
    }
    

    public static void main(String[] args) {

        String testData = "aacecaaa";
        String s = new Leetcode214().shortestPalindrome(testData);
        System.out.println(s);
    }

}
