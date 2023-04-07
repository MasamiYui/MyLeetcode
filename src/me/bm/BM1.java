package me.bm;

import me.nextJourney.base.ListNode;

public class BM1 {
    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
