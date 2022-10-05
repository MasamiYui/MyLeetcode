package me.nextJourney;

import me.nextJourney.base.ListNode;

public class Leetcode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head;
        for(int i=1; i<=left; i++){
            pre = cur;
            cur = cur.next;
        }

        ListNode pre2 = pre;
        ListNode cur2 = cur;

        for(int i=left; i<=right; i++){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        if(pre2 != null){
            pre2.next = pre;

        }else{
            head = pre;
        }
        cur2.next = cur;
        return head;
    }
}
