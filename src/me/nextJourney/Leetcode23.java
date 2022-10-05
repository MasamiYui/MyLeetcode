package me.nextJourney;

import me.nextJourney.base.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode node : lists) {
            while(node != null){
                queue.add(node);
                node = node.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode k = dummy;
        while(!queue.isEmpty()){
            k.next = queue.poll();
            k = k.next;
            if(queue.isEmpty()){
                k.next = null;
            }
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = null;
        ListNode[] lists = {list1, list2};
        ListNode node = new Leetcode23().mergeKLists(lists);
        System.out.println(node);
    }
}
