package com.laioffer;

public class Closest {
    public int closest(int[] array, int target) {
        // corner case: null check
        if (array == null || array.length == 0) {
            return -1;
        }
        // start code from here
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        //postpocessing:
        //1. if array only has 1 element
        //2. if array only has 2 element
        //3. more than 2 element and jump into while loop, but out of loop, decide left or right which is close to target
        return Math.abs(array[left] - target) - Math.abs(array[right] - target) <= 0? left : right;
    }
}
