package me.nextJourney;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode42 {
    /**
     * 经典接雨水233
     */
    public int trap(int[] height) {

        int result = 0;
        Deque<Integer> stack = new LinkedList<>();
        int len = height.length;
        for(int right=0; right<len; right++){
            while (!stack.isEmpty() && height[right] > height[stack.peek()]){
                int bottom = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int leftHeight = height[left];
                int rightHeight = height[right];
                int bottomHeight = height[bottom];
                result = result + (right - left - 1) * (Math.min(leftHeight, rightHeight)- bottomHeight);
            }
            stack.push(right);
        }
        return result;
    }
}
