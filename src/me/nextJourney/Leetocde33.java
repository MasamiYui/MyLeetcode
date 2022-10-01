package me.nextJourney;

public class Leetocde33 {
    public int search(int[] nums, int target) {
        //可以采用二分搜索的方式处理
        //之前考虑可能会从在左右都是升序的情况，但实际上这种情况是不存在的
        int left = 0;
        int right = nums.length -1;
        int mid;
        while(left < right){
            mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left] <= nums[mid]){
                //left is sequence
                if(target >= nums[left] && target < nums[mid]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }else{
                //right is sequence
                if(target <= nums[right] && target > nums[mid]){
                    left = mid+1;
                }else{
                    right = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
