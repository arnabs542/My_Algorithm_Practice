package com.laioffer;

/**
 * Created by xiangyuli on 3/17/17.
 */
public class MyStackByLinkedList {
    private ListNode head;

    //constructor
    public MyStackByLinkedList() {
        head = null;
    }

    // method1: push
    public void push(Integer value) {
        ListNode newHead = new ListNode(value);
        newHead.next = head;
        head = newHead;

    }

    //method2; pop
    public Integer pop() {
        if (head == null) {
            return null;
        }
        ListNode popNode = head;
        head = head.next;
        popNode.next = null;
        return popNode.value;

    }

    //method3: top
    public Integer top() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

}
