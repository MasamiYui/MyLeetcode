package me.nextJourney;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode215 {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>((n1,n2)->{
            return n1-n2;
        });
        for (int num : nums) {
            queue.offer(num);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.poll();

    }

    public static void main(String[] args) {
        int kthLargest = new Leetcode215().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(kthLargest);
    }
}
