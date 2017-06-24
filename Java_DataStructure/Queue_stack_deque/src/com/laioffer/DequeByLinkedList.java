package com.laioffer;


public class DequeByLinkedList {
    private DoubleListNode head;
    private DoubleListNode tail;

    // constructor
    public DequeByLinkedList() {
        head = tail = null;
    }

    //method1: offer
    public void offerFirst(Integer value) {
        if (head==null) {
            head = new DoubleListNode(value);
            tail = head;
            return;
        }
        head.prev = new DoubleListNode(value);
        head.prev.next = head;
        head = head.prev;
    }


    public void offerLast(Integer value) {
        if (tail==null) {
            tail = new DoubleListNode(value);
            head = tail;
            return;
        }
        tail.next = new DoubleListNode(value);
        tail.next.prev = tail;
        tail = tail.next;
    }


    //method2: poll
    public Integer pollFirst() {
        if (head==null) {
            return null;
        }
        DoubleListNode pollNode = head;
        head = head.next;
        pollNode.next = null;
        //corner case: only one element in the queue, head = tail, when head = head.next and poll the only element, tail also need to move
        if (head==null) {
            tail = null;
        }
        return pollNode.value;
    }

    public Integer pollLast() {
        if (tail==null) {
            return null;
        }
        DoubleListNode pollNode = tail;
        tail = tail.prev;
        pollNode.prev = null;
        //corner case: only one element in the queue, head = tail, when head = head.next and poll the only element, tail also need to move
        if (tail==null) {
            head = null;
        }
        return pollNode.value;
    }



    //method3: peek
    public Integer peekFirst() {
        if (head==null) {
            return null;
        }
        return head.value;
    }

    public Integer peekLast() {
        if (tail==null) {
            return null;
        }
        return tail.value;
    }




}

class DoubleListNode {
    public int value;
    public DoubleListNode next, prev;
    public DoubleListNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}