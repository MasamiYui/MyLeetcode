package me.nextJourney;

import me.nextJourney.base.ListNode;

public class LeetCode82 {
    public ListNode deleteDuplicates(ListNode head) {

        if(head ==null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = pre.next;

        while(cur != null){
            ListNode next = cur.next;
            while(next != null && cur.val == next.val){
                next = next.next;
            }
            if(next != cur.next){
                //movied
                pre.next = next;
                cur = next;
            }else{
                pre = cur;
                cur = next;
            }

        }
        return dummy.next;
    }
}
