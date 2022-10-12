package me.nextJourney;

import me.nextJourney.base.ListNode;

public class leetcode148 {
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode brok = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast == null || fast.next == null){
                brok = slow;
            }
            slow = slow.next;
        }
        brok.next = null;
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(slow);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(head1 != null || head2 != null){
            if(head1 == null || (head1 != null && head2 != null && head1.val >= head2.val)){
                cur.next = head2;
                head2 = head2.next;
                cur = cur.next;
            }else{
                cur.next = head1;
                head1 = head1.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
