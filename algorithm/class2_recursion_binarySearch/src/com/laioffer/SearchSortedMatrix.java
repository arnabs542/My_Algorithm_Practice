package com.laioffer;

public class SearchSortedMatrix {
    public int[] searchSortedMatrix(int[][] matrix, int target) {
        //corner case: null check
        if (matrix == null) {return null;}
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[] {-1,-1};
        }
// start the code here
        int row = matrix.length;
        int col = matrix[0].length;
// put the matrix into one array, index left=0 and right= the num of elements of the matrix
        int left = 0;
        int right = row * col - 1;
// while loop to proceed binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int r = mid / col;
            int c = mid % col;
            if (matrix[r][c] == target) {
                return new int[] {r,c};
            } else if (matrix[r][c] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }

}
