package com.laioffer;


public class MyStackByArray {
    private int head;
    private Integer[] array;

    //constructor
    public MyStackByArray(int n) {
        //head starting from -1, seems as a dummyhead, the real head of stack is head+1 psition
        head = -1;
        array = new Integer[n];

    }

    //method1: push()
    public boolean push(int value) {
        //1. if the array is full, cannot push into the stack
        if (head==array.length-1) {
            return false;
        }
        array[++head] = value;
        return true;
    }

    //method2: pop()
    public Integer pop() {
//        if(head==-1) {
//            return null;
//        }
//        Integer result = array[head];
//        head--;
//        return result;
        return head == -1? null : array[head--];
    }

    //method3: top()
    public Integer top() {
        return head == -1? null : array[head];
    }


}
