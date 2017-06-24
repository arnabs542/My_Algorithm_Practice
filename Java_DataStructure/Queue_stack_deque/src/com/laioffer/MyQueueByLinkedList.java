package com.laioffer;


public class MyQueueByLinkedList {

    private ListNode head;
    private ListNode tail;

    // constructor
    public MyQueueByLinkedList() {
        head = tail = null;
    }

    //method1: offer
    public void offer(Integer value) {
        if (head==null) {
            head = new ListNode(value);
            tail = head;
        }
        tail.next = new ListNode(value);
        tail = tail.next;
    }

    //method2: poll
    public Integer poll() {
        if (head==null) {
            return null;
        }
        ListNode pollNode = head;
        head = head.next;
        pollNode.next = null;
        //corner case: only one element in the queue, head = tail, when head = head.next and poll the only element, tail also need to move
        if (head==null) {
            tail = null;
        }
        return pollNode.value;
    }

    //method3: peek
    public Integer peek() {
        if (head==null) {
            return null;
        }
        return head.value;
    }
}
