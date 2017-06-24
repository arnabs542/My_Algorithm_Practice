package com.laioffer;

public class Kcolsest {
    public int[] kClosest (int[] array, int target, int k) {
        if (array == null || array.length == 0 ) {return array;}
        if (k == 0) {return new int[0];}
        // find the K element once the center has been found
        int left = largestSmaller(array, target);
        int right = left + 1;
        int[] result = new int[k];
        for (int i=0; i<k; i++) {
            if (right >= array.length || (left >=0 && (target-array[left]) <= (array[right]-target))) {
                result[i] = array[left];
                left--;
            } else {
                result[i] = array[right];
                right++;
            }
        }
        return result;
    }

    // find the closest one to the target
    private int largestSmaller(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left<right-1) {
            int mid = left + (right - left) / 2;
            if (array[mid]==target) {
                return mid;
            } else if (array[mid]>target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return Math.abs(target - array[left]) - Math.abs(array[right] - target) <= 0? left : right;
    }

}
