package me.nextJourney;

import java.util.*;

public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int idx = 0;
        int[] result = new int[nums.length -k +1];
        for(int i=0; i<nums.length; i++){
            while(!queue.isEmpty() && nums[i] > queue.peekLast()){
                queue.pollLast();
            }
            queue.addLast(nums[i]);
            if(i >= k-1){
                result[idx++] = queue.peekFirst();
                if(nums[i - k +1] == queue.peekFirst()){
                    queue.removeFirst();
                }
            }
        }

        return result;
    }

}
