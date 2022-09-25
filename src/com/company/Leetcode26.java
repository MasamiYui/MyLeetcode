package com.company;

public class Leetcode26 {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int target = 0;
        int next = 1;
        int result = 1;
        while(next <= nums.length -1){
            if(nums[target] == nums[next]){
                next ++;
            }else{
                nums[target+1] = nums[next];
                next++;
                target++;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testData = new int[]{0,0,1,1,1,2,2,3,3,4};
        int i = new Leetcode26().removeDuplicates(testData);
        System.out.println(i);

    }

}
