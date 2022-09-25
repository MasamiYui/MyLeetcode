package com.company;

public class Leetcode167{

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length -1;
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right +1};
            }
            if(sum < target){
                left ++;
            }
            if(sum > target){
                right --;
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] testData = new int[]{2, 7, 11, 15};
        int[] res = new Leetcode167().twoSum(testData, 9);
        for (int re : res) {
            System.out.print(re+" ");
        }
    }
}