package me.bm;

import java.util.LinkedList;
import java.util.Queue;

public class BM92 {
    public int maxLength (int[] arr) {
        // write code here
        int result = 0;
        Queue<Integer> queue = new LinkedList();
        for(int i=0; i<arr.length; i++){
            while(queue.contains(arr[i])){
                queue.poll();
            }
            queue.offer(arr[i]);
            result = Math.max(result, queue.size());
        }
        return result;
    }
}
