/**
 * Given a matrix of size N x M.
 * For each row the elements are sorted in ascending order,
 * and for each column the elements are also sorted in ascending order.
 * Find the Kth smallest number in it.
 Assumptions
 the matrix is not null, N > 0 and M > 0
 K > 0 and K <= N * M
 Examples
 { {1,  3,   5,  7},
 {2,  4,   8,   9},
 {3,  5, 11, 15},
 {6,  8, 13, 18} }
 the 5th smallest number is 4
 the 8th smallest number is 6

 */

import java.util.*;

public class KsmallestSortedMatrix {
    private static class Cell {
        public int row;
        public int col;
        public int value;

        public Cell(int row, int col, int value) {
            this.row = row;
            this.col = col;
            this.value = value;
        }

    }
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] flag = new boolean[row][col];
        Queue<Cell> minHeap = new PriorityQueue<Cell>(k,new Comparator<Cell>(){
            @Override
            public int compare(Cell c1, Cell c2) {
                if (c1.value == c2.value) {return 0;}
                return c1.value < c2.value? -1:1;
            }
        });

        minHeap.offer(new Cell(0,0,matrix[0][0]));
        flag[0][0] = true;
        Cell cur = null;
        for (int i=0;i<k;i++) {
            cur = minHeap.poll();
            //offer the next one in the same row
            if (cur.col+1 < col && flag[cur.row][cur.col+1] == false) {
                minHeap.offer(new Cell(cur.row,cur.col+1,matrix[cur.row][cur.col+1]));
                flag[cur.row][cur.col+1] = true;
            }
            //offer the next one in the same col
            if (cur.row+1 < row && flag[cur.row+1][cur.col] == false) {
                minHeap.offer(new Cell(cur.row+1,cur.col,matrix[cur.row+1][cur.col]));
                flag[cur.row+1][cur.col] = true;
            }
        }
        return cur.value;

    }


}
