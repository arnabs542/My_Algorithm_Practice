
import java.util.*;

public class ValidParenthesisI {
    public List<String> validParenthesisI (int k) {
        List<String> result = new ArrayList<>();
        if (k == 0) {
            return result;
        }

        char[] array = new char[2 * k];
        DFS(array, k, k, 0, result);
        return result;

    }

    public void DFS(char[] array, int left, int right, int index, List<String> result) {
        //recursion base case:
        if (left == 0 && right == 0) {
            result.add(new String(array));
            return;
        }

        //recursive rule
        //case1: add left parenthesis '('
        if (left > 0) {
            array[index] = '(';
            DFS(array,left - 1, right,index + 1, result);
        }

        //case2: add right parenthesis ')'
        if (right > left) {
            array[index] = ')';
            DFS(array,left, right - 1,index + 1, result);
        }
    }
}
