package com.laioffer;

/**
 Insert a value in a sorted linked list.
 Examples
 L = null, insert 1, return 1 -> null
 L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
 L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
 L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null

 */
public class InsertNode {
    public ListNode insertNode(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        // if head is null or newNode before head
        if (head == null || newNode.value <= head.value) {
            newNode.next = head;
            return newNode;
        }
        // if the newNode is on the right of head node
        ListNode newHead = head;
        // focus!! while loop condition: head.next.value < value!!
        while (head.next != null && head.next.value < value) {
            head = head.next;
        }
        newNode.next = head.next;
        head.next = newNode;
        return newHead;
    }
}
