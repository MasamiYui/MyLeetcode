package me.bm;

import me.nextJourney.base.ListNode;

public class BM8 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        for(int i=0; i<k; i++){
            if(p2 == null){
                return null;
            }
            p2 = p2.next;


        }
        while(p2 !=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
