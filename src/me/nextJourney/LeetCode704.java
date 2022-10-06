package me.nextJourney;

public class LeetCode704 {


    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] testCase = {-1,0,3,5,9,12};
        int target = 9;
        int result = new LeetCode704().search(testCase, target);
        System.out.println(result);
    }
}
