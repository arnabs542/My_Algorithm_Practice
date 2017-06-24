package com.laioffer;

/**
implement a queue using array, including the method offer(), poll(), peek(), size(), isEmpty(), isFull();
 */

//circular array

public class QueueByArrayRecordSize {
    private int head;
    private int tail;
    private int size;
    private Integer[] array;

    //constructor: the queue capacity is limited to n
    public QueueByArrayRecordSize(int n) {
        head = 0;
        tail = 0;
        size = 0;
        array = new Integer[n];
    }

    //method1: offer() put to tail, tail point to next avaliable position
    public boolean offer(int value) {
        //if the array is full, cannot add anymore
        if (size==array.length) {
            return false;
        }
        array[tail] = value;
        //corner case: tail++ to confirm if tail has come to the last position of the array

        tail = tail + 1 == array.length? 0 : tail + 1;
        size++;
        return true;
    }

    //method2: poll() poll from head, head point to next avaliable position
    public Integer poll() {
        //if the array is empty, nothing to poll
        if (size==0) {
            return null;
        }
        Integer result = array[head];
        head = head + 1 == array.length? 0 : head + 1;
        size--;
        return result;

    }

    //method3: peek the element head point to
    public Integer peek() {
        // if the array is empty, nothing to peek
        if (size==0) {
            return null;
        }
        return array[head];
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
