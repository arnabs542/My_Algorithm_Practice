package com.laioffer;


public class HasCycle {
    public boolean hasCycle(ListNode head) {
        // corner case: if list is null or list only has 1 node, return false,no cycle
        if (head == null || head.next == null) {
            return false;
        }

        // if the list has more than 2 nodes
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
