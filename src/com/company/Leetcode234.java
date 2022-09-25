package com.company;

public class Leetcode234 {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) {
            return true;
        }
        ListNode dummy = new ListNode();
        //dummy.next = head;
        ListNode fast = head;
        ListNode slow = head;
        if(fast.next.next == null){
            if(fast.val == fast.next.val){
                return true;
            }else{
                return false;
            }
        }
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverseList(slow.next);
        fast = head;
        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    /**
     * Leetcode 206
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode cur = null;
        ListNode pre = head;
        while(pre != null){
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre =temp;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next= new ListNode(0);
        test.next.next= new ListNode(0);
        boolean b = new Leetcode234().isPalindrome(test);
        System.out.println(b);
    }


}
