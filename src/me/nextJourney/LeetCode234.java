package me.nextJourney;

import com.company.Leetcode234;
import me.nextJourney.base.ListNode;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = head;
        ListNode head2 = slow.next;
        slow.next = null;

        //将head2逆序
        ListNode pre = null;
        ListNode next = null;
        while(head2 != null){
            next = head2.next;
            head2.next = pre;
            pre = head2;
            head2 = next;
        }

        head2 = pre;
        while(head1 != null && head2 != null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
//        node.next.next = new ListNode(2);
//        node.next.next.next = new ListNode(1);
//        node.next.next.next.next = null;
        boolean palindrome = new LeetCode234().isPalindrome(node);
        System.out.println(palindrome);
    }


}
