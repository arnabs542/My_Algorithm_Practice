package com.laioffer;

/**
 * Created by xiangyuli on 4/4/17.
 */


public class KClosestEle {
    public int[] kclosest(int[] array, int target, int k) {
        //null check
        if (k == 0 || array == null || array.length == 0) {
            return new int[0];
        }
        //find the middle element closest to target
        int left = 0;
        int right = array.length - 1;
        int closest = 0;
        int[] result = new int[k];
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                closest = mid;
            } else if (array[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        //when out of loop, check which is closer to target
        if (Math.abs(array[left] - target) >= Math.abs(array[left] - right) ) {
            closest = right;
        } else { closest = left; }

        //put K closest elements in the array
        int next = closest + 1;
        for (int i=0;i<k;i++) {
            if (next >= array.length || (closest >= 0 && ((target - array[closest]) <= (array[next] - target)))) {
                result[i] = array[closest--];
            } else {
                result[i] = array[next++];
            }
        }
        return result;
    }
}
