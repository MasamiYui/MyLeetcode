package me.nextJourney;

import me.nextJourney.base.ListNode;

public class Leetcode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    cur.next = list1;
                    cur = list1;
                    list1 = list1.next;
                }else{
                    cur.next = list2;
                    cur = list2;
                    list2 = list2.next;
                }
            }else if(list1 != null && list2 == null){
                cur.next = list1;
                break;
            }else{
                cur.next = list2;
                break;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = new Leetcode21().mergeTwoLists(list1, list2);
        System.out.println(result);
    }
}
