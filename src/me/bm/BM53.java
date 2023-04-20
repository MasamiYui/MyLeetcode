package me.bm;

import java.util.HashSet;

public class BM53 {
    public int minNumberDisappeared (int[] nums) {

        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int i = 1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int i = new BM53().minNumberDisappeared(new int[]{3,2,1});
        System.out.println(i);
    }
}
