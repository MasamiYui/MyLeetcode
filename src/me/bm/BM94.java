package me.bm;

import java.util.Stack;

public class BM94 {
    public long maxWater (int[] arr) {
        // write code here
        int result =0;
        int len = arr.length;
        if(len < 3){
            return 0;
        }
        int[] leftMaxArr = new int[len];
        int[] rightMaxArr = new int[len];
        leftMaxArr[0] = arr[0];
        rightMaxArr[len -1] = arr[len-1];

        for(int i=1; i<arr.length; i++){
            leftMaxArr[i] = Math.max(leftMaxArr[i-1], arr[i]);
        }

        for(int i= len-2; i>=0; i--){
            rightMaxArr[i] = Math.max(rightMaxArr[i+1], arr[i]);
        }

        for(int i=0; i<len; i++){
            result = result +  ( Math.min(leftMaxArr[i], rightMaxArr[i]) - arr[i] );
        }

        return result;
    }



    public long maxWater2 (int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i =0;
        int result =0;
        while(i<arr.length){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int top = stack.pop();
                if(stack.empty()){
                    break;
                }
                int distance = i - stack.peek() - 1;
                int bHeight = Math.min(arr[i], arr[stack.peek() - arr[top]]);
                result = result + distance * bHeight;
            }
            stack.push(i++);
        }
        return result;
    }
}
