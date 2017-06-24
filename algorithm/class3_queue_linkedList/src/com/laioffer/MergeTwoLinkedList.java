package com.laioffer;

/**
 * Created by xiangyuli on 3/15/17.
 */
public class MergeTwoLinkedList {
    public ListNode mergeTwoLinkedList(ListNode head1, ListNode head2) {
//corner case: one or two list is null
        if (head1 == null || head2 == null) {
            if(head1 == null &&  head2 == null) {
                return null;
            }
            return head1 == null? head2 : head1;
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode cur = dummy;
        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                cur.next = head1;
                head1 = head1.next;

            } else {
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }

// out of loop: check which list already on the end
        if (head1 == null) {
            cur.next = head2;
        }
        if (head2 == null) {
            cur.next = head1;
        }
        return dummy.next;
    }

}
