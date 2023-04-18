package me.bm;

public class BM88 {
    public boolean judge (String str) {
        // write code here
        int left = 0;
        int right = str.length() -1;
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean f = new BM88().judge("abaa");
        System.out.println(f);
    }
}
