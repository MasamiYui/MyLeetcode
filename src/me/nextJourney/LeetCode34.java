package me.nextJourney;

public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        boolean isStart = false;
        boolean isEnd = false;
        for(int i=0; i<nums.length; i++){

                if(target == nums[i] && !isStart){
                    isStart = true;
                    result[0] = i;
                    continue;
                }
                if(isStart && target != nums[i]){
                    result[1] = i-1;
                    isEnd = true;
                    break;
                }
        }
        if(isStart && !isEnd){
            result[1] = nums.length-1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = new LeetCode34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(ints);
    }
}
