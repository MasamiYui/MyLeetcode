package me.bm;

public class BM93 {
    public int maxArea (int[] height) {
        // write code here
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left+1 <= right){
            result = Math.max(result, (right-left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new BM93().maxArea(new int[]{1, 2});
        System.out.println(i);
    }
}
