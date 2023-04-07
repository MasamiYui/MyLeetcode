package me.bm;

import me.nextJourney.base.ListNode;

public class BM2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preStart = dummy;
        ListNode start = head;
        for (int i = 1; i < m; i ++ ) {
            preStart = start;
            start = start.next;
        }
        // reverse
        for (int i = 0; i < n - m; i ++ ) {
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = preStart.next;
            preStart.next = temp;
        }
        return dummy.next;
    }
}
