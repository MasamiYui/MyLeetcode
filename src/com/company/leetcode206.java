package com.company;

public class leetcode206 {
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

    }
}
