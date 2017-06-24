package com.laioffer;



public class Test {
    public static void main(String[] args) {
//        testReverseLinkedList();
//        testMiddleLinkedList();
//        testHasCycle();
//        testInsertNode();
//        testMergeTwoLinkedList();
//        testReOrder();
//        testPartitionList();
        testRemove();

    }


    // test reverse linkedlist
    public static void testReverseLinkedList() {
        ReverseLinkedList solution = new ReverseLinkedList();
        //create a linkedlist
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode newHead = solution.reverseLinkedListRecursion(node1);
        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }

    // test middle of linkedlist
    public static void testMiddleLinkedList() {
        MiddleLinkedList solution = new MiddleLinkedList();
        //create a linkedlist
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode result = solution.middleLinkedList(node1);
        System.out.println(result.value);
    }

    // test linkedlist has cycle
    public static void testHasCycle() {
        HasCycle solution = new HasCycle();
        //create a linkedlist
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        node4.next = node2;
//        ListNode node5 = null;
//        ListNode node6 = new ListNode(6);
        boolean result = solution.hasCycle(node1);
        System.out.println(result);
    }

    // test insert node into linkedlist
    public static void testInsertNode() {
        InsertNode solution = new InsertNode();
        //create a linkedlist
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        int value = 6;
        ListNode newHead = solution.insertNode(node1,value);
        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }

    // test merge two linked list
    public static void testMergeTwoLinkedList() {
        MergeTwoLinkedList solution = new MergeTwoLinkedList();
        //create a linkedlist
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(8);
        ListNode node8 = new ListNode(10);
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

//        ListNode node9 = null;
//        ListNode node10 = new ListNode(12);

        ListNode newHead = solution.mergeTwoLinkedList(node1,node5);
        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }

    }

    // test Reorder list
    public static void testReOrder() {
        ReOrder solution = new ReOrder();
        //create a linkedlist
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode newHead = solution.reorder(node1);
        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }

    // test partition list
    public static void testPartitionList() {
        PartitionList solution = new PartitionList();
        //create a linkedlist
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        int target = 3;
        ListNode newHead = solution.partitionList(node1,target);
        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }

    public static void testRemove() {
        Remove solution = new Remove();
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        int target = 2;
        ListNode newHead = solution.remove(node1,target);
        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }


}


class ListNode {
    public int value;
    public ListNode next;
    // constructor
    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

}