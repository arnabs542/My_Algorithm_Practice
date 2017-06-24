/**
 * Created by xiangyuli on 4/17/17.
 */
import java.util.*;

public class Test {
    public static void main(String[] args) {
        NQueen solution = new NQueen();
        List<List<Integer>> result = solution.nqueen(4);
        System.out.println(result);
    }
}


class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}