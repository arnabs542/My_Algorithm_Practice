/**
 * Given an unsorted integer array, find the subarray that has the greatest sum. Return the sum.

 Assumptions

 The given array is not null and has length of at least 1.
 Examples

 {2, -1, 4, -2, 1}, the largest subarray sum is 2 + (-1) + 4 = 5

 {-2, -1, -3}, the largest subarray sum is -1
 */


public class LargestSubArraySum {
    public int largestSum(int[] array) {
        int max = array[0];
        int curMax = array[0];
        int global_start = 0;
        int global_end = 0;
        for (int i = 1; i < array.length; i++) {
            int start = 0;
            if (curMax >= 0) {
                curMax = curMax + array[i];
            } else {
                curMax = array[i];
                start = i;
            }
            max = Math.max(max, curMax);
            if (max == curMax) {
                global_start = start;
                global_end = i; }
        }
        return max;
    }
}
