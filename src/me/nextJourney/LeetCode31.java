package me.nextJourney;

import com.company.Leetcode31;

import java.util.Arrays;
import java.util.Collections;

public class LeetCode31 {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n <=1){
            return;
        }
        int i = n -2;
        while (i>=0 && nums[i]>= nums[i+1]){
            i--;
        }
        if(i<0){
            reverse(nums, 0 ,n-1);
        }else{
            int j = n-1;
            while(i<j && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i , j);
            reverse(nums, i+1, n-1);
        }
    }

    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void reverse(int[] nums, int i, int j){
        while(i <= j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] testCase = new int[]{1,3,2};
        new LeetCode31().nextPermutation(testCase);

        Arrays.stream(testCase).forEach(num -> System.out.println(num));
    }
}
