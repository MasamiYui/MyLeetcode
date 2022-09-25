package com.company;

public class Leetcode24 {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null && cur.next.next != null){
            ListNode next = cur.next;
            ListNode nextnext = cur.next.next;
            next.next  = nextnext.next;
            nextnext.next = next;
            cur.next = nextnext;
            cur = cur.next.next;
        }
        return dummy.next;
    }
}
