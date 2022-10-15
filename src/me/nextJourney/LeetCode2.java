package me.nextJourney;

import me.nextJourney.base.ListNode;

import java.util.Arrays;
import java.util.List;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int len1 = getListNodeLength(l1);
        int len2 = getListNodeLength(l2);
        if(len1 > len2){
            l2 = fillZeroInTail(l2, len1-len2);
        }else if(len1 < len2){
            l1 = fillZeroInTail(l1, len2 -len1);
        }

        //do plus handle
        int addNum = 0;
        ListNode result_dummy = new ListNode(0);
        ListNode result_pivot = result_dummy;
        while(l1 != null){
            int val = l1.val + l2.val + addNum;
            ListNode node = new ListNode(val % 10);
            result_pivot.next = node;
            result_pivot = result_pivot.next;
            addNum = val / 10;
            l1 = l1.next; l2 = l2.next;
        }
        if(addNum != 0){
            ListNode node = new ListNode(1);
            result_pivot.next = node;
        }
        return result_dummy.next;
    }

    public ListNode fillZeroInTail(ListNode listnode, int zeroNums){
        ListNode head = listnode;
        while(listnode.next != null){
            listnode = listnode.next;
        }
        for(int i=0; i< zeroNums; i++){
            listnode.next = new ListNode(0);
            listnode = listnode.next;
        }
        listnode.next = null;
        return head;
    }

    private int getListNodeLength(ListNode listNode) {
        if(listNode == null){
            return 0;
        }
        int len = 0;
        while(listNode != null){
            listNode = listNode.next;
            len ++;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);  l1.next = new ListNode(4); l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);  l2.next = new ListNode(6); l2.next.next = new ListNode(4);
        ListNode node = new LeetCode2().addTwoNumbers(l1, l2);
        System.out.println(node);
    }

}
