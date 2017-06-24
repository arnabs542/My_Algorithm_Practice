package com.laioffer;


public class DequeByArray {
    private int head;
    private int tail;
    private int size;
    private Integer[] array;

    //constructor: the queue capacity is limited to n
    public DequeByArray(int n) {
        head = 0;
        tail = 0;
        size = 0;
        array = new Integer[n];
    }

    //method1: offer() put to tail, tail point to next avaliable position
    public boolean offerLast(int value) {
        //if the array is full, cannot add anymore
        if (size==array.length) {
            return false;
        }
        //corner case: tail++ to confirm if tail has come to the last position of the array
        tail = tail + 1 == array.length? 0 : tail + 1;
        array[tail] = value;
        size++;
        return true;
    }


    public boolean offerFirst(int value) {
        //if the array is full, cannot add anymore
        if (size==array.length) {
            return false;
        }
        array[head] = value;
        //corner case: head-- to confirm if head has come to the first position of the array
        head = head == 0? array.length - 1 : head - 1;
        size++;
        return true;
    }



    //method2: poll() poll from head, head point to next avaliable position
    public Integer pollLast() {
        //if the array is empty, nothing to poll
        if (size==0) {
            return null;
        }
        Integer result = array[tail];
        tail = tail == 0? array.length - 1 : tail - 1;
        size--;
        return result;

    }


    public Integer pollFirst() {
        //if the array is empty, nothing to poll
        if (size==0) {
            return null;
        }
        //corner case: head++ to confirm if head has come to the last position of the array
        head = head + 1== array.length? 0 : head + 1;
        size--;
        return array[head];

    }

    //method3: peek the element head point to
    public Integer peekLast() {
        // if the array is empty, nothing to peek
        if (size==0) {
            return null;
        }
        return array[tail];
    }

    public Integer peekFirst() {
        // if the array is empty, nothing to peek
        if (size==0) {
            return null;
        }
        int headNow = head + 1== array.length? 0 : head + 1;
        return array[headNow];

    }

    //method4: return the size
    public int size() {
        return size;
    }

    //method5: isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    //method6: isFull
    public boolean isFull() {
        return size == array.length;
    }

}
