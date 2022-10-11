package me.nextJourney;

import me.nextJourney.base.ListNode;

import java.util.Random;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode tail = head;
        for(int i = 0; i < n; i++){
            tail = tail.next;
        }
        while(tail.next != null){
            head = head.next;
            tail =tail.next;
        }
        head.next = head.next.next;
        return dummy.next;
    }


}
