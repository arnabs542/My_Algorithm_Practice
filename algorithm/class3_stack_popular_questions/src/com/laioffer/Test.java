package com.laioffer;

import java.util.Deque;

/**
 * Created by xiangyuli on 3/16/17.
 */
public class Test {
    public static void main(String[] args) {
//        testMinStackWithDuplicate();
        testSortWithTwoStacks();
    }


    public static void testMinStackWithDuplicate() {
        MinStackWithDuplicate stack = new MinStackWithDuplicate();
        stack.push(3);
        stack.push(1);
        stack.push(-7);
        stack.push(-7);
        stack.pop();
        stack.pop();
        System.out.println(stack.min());
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(-9);
        stack.push(-9);
        System.out.println(stack.min());
        stack.push(-10);
        System.out.println(stack.min());
        stack.push(11);
        stack.push(13);
        System.out.println(stack.min());



    }

    public static void testSortWithTwoStacks() {
        SortWithTwoStacks solution = new SortWithTwoStacks();
        int[] array = new int[]{3};
        Deque<Integer> result = solution.sortWithTwoStacks(array);

        while(!result.isEmpty()) {
            System.out.println(result.pop());
        }

    }

}
