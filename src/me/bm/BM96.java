package me.bm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class BM96 {
    public int minmumNumberOfHost (int n, int[][] startEnd) {
        Arrays.sort(startEnd,(o1,o2)->{
            //o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]
            if(o1[0] == o2[0]){
                if(o1[1] > o2[1]){
                    return 1;
                }else{
                    return -1;
                }
            }else{
                if(o1[0] > o2[0]){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] activity : startEnd) {
            if(!pq.isEmpty()  &&  pq.peek() <= activity[0]){
                pq.poll();
            }
            pq.offer(activity[1]);
        }

        return pq.size();
    }
}
