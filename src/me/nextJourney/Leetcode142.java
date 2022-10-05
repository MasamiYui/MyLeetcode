package me.nextJourney;

import me.nextJourney.base.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode142 {

    public ListNode detectCycle(ListNode head) {

        ListNode pos = head;
        List<ListNode> visited = new ArrayList<>();
        while(pos != null){
            if(visited.contains(pos)){
                return pos;
            }else{
                visited.add(pos);
            }
            pos = pos.next;
        }

        return null;
    }
}
