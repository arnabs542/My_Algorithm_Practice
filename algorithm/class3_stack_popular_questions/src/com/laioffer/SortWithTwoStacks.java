package com.laioffer;
import java.util.*;
/**
 * Created by xiangyuli on 3/20/17.
 */


public class SortWithTwoStacks {
    public Deque<Integer> sortWithTwoStacks(int[] array) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        // put array values into stack1
        for (int i = 0; i < array.length; i++) {
            stack1.push(array[i]);
        }

        //start looping
        while(!stack1.isEmpty()) {
            int global = Integer.MIN_VALUE;
            int counter = 0;
            int size = stack2.size();
            //put values in stack1 into stack2
            while (!stack1.isEmpty()) {
                if (stack2.size() == size || stack1.peek() < global) {
                    global = stack1.peek();
                    counter = 1;
                } else if (stack1.peek() == global) {
                    counter++;
                }
                stack2.push(stack1.pop());
            }
            //put stack2 into stack1
            while (stack2.size() > size) {
                if (stack2.peek() > global) {
                    stack1.push(stack2.pop());
                }else {
                    stack2.pop();
                }
            }
            for (int j = 0; j < counter; j++) {
                stack2.push(global);
            }
        }
        return stack2;

    }
}

