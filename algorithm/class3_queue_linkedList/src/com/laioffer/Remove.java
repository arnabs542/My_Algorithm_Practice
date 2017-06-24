package com.laioffer;


public class Remove {
    public ListNode remove(ListNode head, int n) {
        //null check
        if (head == null) {
            return null;
        } else if (head.value == n) {
            return head.next;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.value == n) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;


    }
}
