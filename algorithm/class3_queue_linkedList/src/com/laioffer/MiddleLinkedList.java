package com.laioffer;

/**
 Find the middle node of a given linked list.

 Examples
 L = null, return null
 L = 1 -> null, return 1
 L = 1 -> 2 -> null, return 1
 L = 1 -> 2 -> 3 -> null, return 2
 L = 1 -> 2 -> 3 -> 4 -> null, return 2

 */
public class MiddleLinkedList {
    public ListNode middleLinkedList(ListNode head) {
        //1. check null
        if (head == null) {
            return head;
        }

        //2. out of loop conditioon: head.next == null || head.next.next == null
        ListNode slow = head;
        while(head.next != null && head.next.next != null) {
            slow = slow.next;
            head = head.next.next;
        }
        return slow;
    }
}
