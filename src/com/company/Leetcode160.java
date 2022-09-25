package com.company;

public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while(nodeA != nodeB){
            if(nodeA != null){
                nodeA = nodeA.next;
            }else{
                nodeA = headB;
            }
            if(nodeB != null){
                nodeB = nodeB.next;
            }else{
                nodeB = headA;
            }
        }
        return nodeA;
    }
}
