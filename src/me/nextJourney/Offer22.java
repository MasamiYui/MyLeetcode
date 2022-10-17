package me.nextJourney;

import me.nextJourney.base.ListNode;

/**
 * https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode left = head;
        ListNode right = head;
        for(int i = 0; i<k; i++){
            right = right.next;
        }
        while(right != null){
            left = left.next;
            right = right.next;
        }
        return left;
    }
}
