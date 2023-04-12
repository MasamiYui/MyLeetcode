package me.bm;

import me.nextJourney.base.ListNode;

public class BM9 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here



        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        for(int i=0; i<n; i++){
            if(p2 == null){
                return null;
            }
            p2 = p2.next;
        }
        while(p2.next !=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return dummy.next;
    }
}
