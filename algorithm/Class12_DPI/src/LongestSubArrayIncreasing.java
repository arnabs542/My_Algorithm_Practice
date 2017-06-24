/**
 * Longest Ascending SubArray
 Given an unsorted array, find the length of the longest subarray in which the numbers are in ascending order.

 Assumptions

 The given array is not null
 Examples

 {7, 2, 3, 1, 5, 8, 9, 6}, longest ascending subarray is {1, 5, 8, 9}, length is 4.

 {1, 2, 3, 3, 4, 4, 5}, longest ascending subarray is {1, 2, 3}, length is 3.
 */

public class LongestSubArrayIncreasing {
    public int longest(int[] array) {
        if (array.length == 0) { return 0;}
        //DP base case
        int[] M = new int[array.length];
        M[0] = array[0];
        int max = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                M[i] = M[i - 1] + 1;
                max = Math.max(max, M[i]);
            } else {
                M[i] = 1;
            }

        }
        return max;
    }
}
