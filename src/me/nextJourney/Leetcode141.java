package me.nextJourney;

import me.nextJourney.base.ListNode;

public class Leetcode141 {
    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!= null){
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else{
                return false;
            }
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
