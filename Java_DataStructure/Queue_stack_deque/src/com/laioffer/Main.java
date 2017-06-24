package com.laioffer;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        testDequeByArray();
    }

    public static void testDequeByArray() {
        DequeByArray soltuion = new DequeByArray(7);
        System.out.println(soltuion.offerFirst(2));
        System.out.println(soltuion.offerFirst(6));
        System.out.println(soltuion.offerLast(6));
        System.out.println(soltuion.peekLast());
        System.out.println(soltuion.offerLast(8));
        System.out.println(soltuion.peekLast());
        System.out.println(soltuion.offerLast(3));
        System.out.println(soltuion.peekLast());
        System.out.println(soltuion.offerFirst(1));
        System.out.println(soltuion.peekFirst());
        System.out.println(soltuion.offerFirst(0));
        System.out.println(soltuion.peekFirst());
        System.out.println(soltuion.offerFirst(0));
        while (!soltuion.isEmpty()) {
            System.out.println(soltuion.pollFirst());
        }


    }


}

class ListNode {
    public int value;
    //    public ListNode prev;
    public ListNode next;
    //constructor
    public ListNode(int value) {
        this.value = value;
        this.next = next;
    }

}