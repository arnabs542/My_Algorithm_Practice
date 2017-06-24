package com.laioffer;

/**
 Reverse a singly-linked list.
 Examples
 L = null, return null
 L = 1 -> null, return 1 -> null
 L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null

 */
public class ReverseLinkedList {

    public ListNode reverseLinkedListIteration(ListNode head) {
        //corner case: head == null or head.next == null
        if (head == null || head.next == null) {
            return head;
        }
        //when the linkedlist has more than 2 nodes
        ListNode newHead = null;
        ListNode curNode = head;
        while (head != null) {
            head = head.next;
            curNode.next = newHead;
            newHead = curNode;
            curNode = head;
        }
        return newHead;
    }

    public ListNode reverseLinkedListRecursion(ListNode head) {
        ////base case:find the last node of the original linkedlist
        if (head == null || head.next == null) {
            return head;
        }
        //recursive part
        ListNode newHead = reverseLinkedListRecursion(head.next);
        // after touch the basecase, do the following reverse
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}




