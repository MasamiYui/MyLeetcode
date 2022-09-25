package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode23 {

    class MyComparetor implements Comparator<ListNode>{

        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> q = new PriorityQueue<>(new MyComparetor());
        for (ListNode head : lists) {
            while (head != null){
                q.offer(head);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while( q.size() >0){
            ListNode t = q.poll();
            head.next = t;
            head = head.next;
            if(q.size() == 0){
                head.next = null;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
    }
}
