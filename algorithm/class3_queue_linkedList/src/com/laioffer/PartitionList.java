package com.laioffer;

public class PartitionList {
    public ListNode partitionList(ListNode head, int target) {
//corner case: null check
        if (head == null || head.next == null) {return head;}
        ListNode small = new ListNode(Integer.MIN_VALUE);
        ListNode large = new ListNode(Integer.MIN_VALUE);
        ListNode curSmall = small;
        ListNode curLarge = large;
        while (head != null) {
            if (head.value < target) {
                curSmall.next = head;
                curSmall = curSmall.next;
            } else {
                curLarge.next = head;
                curLarge = curLarge.next;
            }
            head = head.next;
        }
// out of loop: link small and large list
        curSmall.next = large.next;
// de-link the tail node in large list
        curLarge.next = null;
        return small.next;
    }
}
