package com.laioffer;

/**
 * Created by xiangyuli on 3/14/17.
 */
public class FirstOccuBinarySearch {
    public int firstOccuBinarySearch(int[] array, int target) {
        // corner case: null check
        if (array == null || array.length == 0) {return -1;}
        // start code from here
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        //postprocessing:
        //1. if array only has 1 element
        //2. if array only has 2 element
        //3. more than 2 element and jump into while loop, but out of loop, decide left or right which is target
        //4. more than 2 element and jump into while loop, but out of loop, left and right all not equals to target
        if (array[left] == target) { return left;}
        if (array[right] == target) { return right;}
        return -1;
    }
}
