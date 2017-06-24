package com.laioffer;

import java.util.*;

/**
 * find the min number in the stack when there is duplicate elements in the stack
 * Enhance the stack implementation to support min() operation. min() should return the current minimum value in the stack. If the stack is empty, min() should return -1.
 * pop() - remove and return the top element, if the stack is empty, return -1
 * push(int element) - push the element to top
 * top() - return the top element without remove it, if the stack is empty, return -1
 * min() - return the current min value in the stack.
 */

public class MinStackWithDuplicate {

    //stack: normally push elements into stack
    // minStack: put the current minimum element into the stack, also record the stack size when the element is pushed into the minStack
    private Deque<Integer> stack;
    private Deque<Pairs> minStack;

    //constructor
    public MinStackWithDuplicate() {
        stack = new ArrayDeque<Integer>();
        minStack = new ArrayDeque<Pairs>();
    }

    //method1: push()
    public void push(int element) {
        stack.push(element);
        if (minStack.isEmpty() || element<minStack.peek().value) {
            minStack.push(new Pairs(element, stack.size()));
        }
    }

    //method2: top()
    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    //method3: pop()
    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        if (stack.size()<=minStack.peek().curSize) {
            minStack.pop();
        }
        return stack.pop();

    }


    //method4: min()
    public int min() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek().value;
    }



    private class Pairs {
        int value;
        int curSize;
        public Pairs(int value, int curSize) {
            this.value = value;
            this.curSize = curSize;
        }
    }
}
