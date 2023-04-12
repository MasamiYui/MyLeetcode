package me.bm;

import me.nextJourney.base.ListNode;

public class BM7 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {

        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        //reset
        slow = pHead;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
