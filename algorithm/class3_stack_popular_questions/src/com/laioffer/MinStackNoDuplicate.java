package com.laioffer;

import java.util.*;

public class MinStackNoDuplicate {

        //attribute
        private Deque<Integer> stack;
        private Deque<Integer> minStack;

        //constructor
        public MinStackNoDuplicate() {
            stack = new LinkedList<Integer>();
            minStack = new LinkedList<Integer>();
        }

        // method1: min()
        public int min() {
            if (minStack.isEmpty()) {
                return -1;
            }
            //return the min of the minStack
            return minStack.pollFirst();
        }

        //method2: push()
        public void push(int value) {
            stack.offerFirst(value);
            if (minStack.isEmpty() || value <= minStack.peekFirst()) {
                minStack.offerFirst(value);
            }
        }

        // method3: top()
        public int top() {
            if (stack.isEmpty()) {
                return -1;
            }
            return stack.peekFirst();
        }
        //method4: pop()
        public int pop() {
            if (stack.isEmpty()) {
                return -1;
            }
            if (stack.peekFirst() == minStack.peekFirst()) {
                minStack.pollFirst();
            }
            return stack.pollFirst();
        }

}
