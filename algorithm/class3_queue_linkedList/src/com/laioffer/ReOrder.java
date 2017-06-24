package com.laioffer;

/**
 * Created by xiangyuli on 3/15/17.
 */
public class ReOrder {
    public ListNode reorder(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // the first list, not reversed
        ListNode firstList = head;
        // find the middle node and the second list
        ListNode mid = findMiddle(head);
        // secondList head is the reversed list
        ListNode secondList = reverse(mid.next);
        // mid node is the tail of the first list, delink with second list
        mid.next = null;
        ListNode result = merge(firstList, secondList);
        return result;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        while(head.next != null && head.next.next != null) {
            head = head.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        //base case
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

     private ListNode merge(ListNode firstList, ListNode secondList) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode cur = dummy;
        while (firstList != null && secondList != null) {
            cur.next = firstList;
            firstList = firstList.next;
            cur.next.next = secondList;
            secondList = secondList.next;
            cur = cur.next.next;
        }
        // check which list come to the tail
        if (firstList == null) {
            cur.next = secondList;
        }
        if (secondList == null) {
            cur.next = firstList;
        }
        return dummy.next;
    }

}
