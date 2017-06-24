package com.laioffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 Java: Implement a queue by using two stacks.
 The queue should provide size(), isEmpty(), offer(), poll() and peek() operations.
 When the queue is empty, poll() and peek() should return null.

 Assumptions

 The elements in the queue are all Integers.
 size() should return the number of elements buffered in the queue.
 isEmpty() should return true if there is no element buffered in the queue, false otherwise.
 */

public class QueueByTwoStacks {
    // attribute: two stack of the queue class
    private Deque<Integer> inStack;
    private Deque<Integer> outStack;

    // constructor: define the class of stack, use linkedlist to implement
    public QueueByTwoStacks() {
        inStack = new LinkedList<Integer>();
        outStack = new LinkedList<Integer>();
    }

    //method1: poll
    public Integer poll() {
        // if the outstack is empty, move instack to outstack
        move();
        return outStack.isEmpty()? null: outStack.pollFirst();
    }

    //method2: peek
    public Integer peek() {
        // if the outstack is empty, move instack to outstack
        move();
        return outStack.isEmpty()? null: outStack.peekFirst();
    }

    //helper fucntion move()
    // when outstack is empty and instack is not empty, we move instack to outstack
    private void move() {
        if (outStack.isEmpty()) {
            while(!inStack.isEmpty()) {
                outStack.offerFirst(inStack.pollFirst());
            }
        }
    }

    //method3: offer
    public void offer(int value) {
        inStack.offerFirst(value);
    }

    //method4: size
    public int size() {
        return inStack.size() + outStack.size();
    }

    //method5: isempty
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

}
