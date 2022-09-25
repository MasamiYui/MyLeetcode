package com.company;

import java.util.List;

public class Leetcode203 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode local = head;
        while(local != null){
            if(local.val == val){
                pre.next = local.next;//remove
            }else{
                pre = local;
            }
            local = local.next;
        }
        return dummy.next;
    }

}
