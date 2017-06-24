/**
 * Get all valid ways of putting N Queens on an N * N chessboard so that no two Queens threaten each other.

 Assumptions

 N > 0
 Return

 A list of ways of putting the N Queens
 Each way is represented by a list of the Queen's y index for x indices of 0 to (N - 1)
 Example

 N = 4, there are two ways of putting 4 queens:

 [1, 3, 0, 2] --> the Queen on the first row is at y index 1, the Queen on the second row is at y index 3, the Queen on the third row is at y index 0 and the Queen on the fourth row is at y index 2.

 [2, 0, 3, 1] --> the Queen on the first row is at y index 2, the Queen on the second row is at y index 0, the Queen on the third row is at y index 3 and the Queen on the fourth row is at y index 1.
 */
import java.util.*;

public class NQueen {
    public List<List<Integer>> nqueen(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        helper(n,cur,result);
        return result;
    }

    private void helper(int n, List<Integer> cur, List<List<Integer>> result ) {
        //base case: the cur.size == n, 每行queen应该放置的位置已经确定过，可以输出结果
        if (cur.size() == n) {
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        //recursion rule : DFS principle
        for (int i = 0; i < n; i++) {
            //check if queen add into the ith in the cur is valid or not, go back to see if it is valid based on the upper level queen
            if (valid(cur,i)) {
                cur.add(i);
                helper(n,cur,result);
                cur.remove(cur.size() - 1);
            }
        }
    }

    //this function is to check whether put queen in ith position conflicts the current queen inseted or not
    private boolean valid(List<Integer> cur, int i) {
        int row = cur.size();
        for (int j = 0; j < row; j++) {
            if (cur.get(j) == i || Math.abs(cur.get(j) - i) == row - j) {
                return false;
            }
        }
        return true;
    }
}
