
import java.util.*;
public class OrderPermutation {
    public List<String> getPermutation(int n) {
        List<String> result = new ArrayList<String>();
        char[] array = new char[n];
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            array[i] = (char)(j + '0');
        }
        helper(array, 0, result);
        return result;

    }

    private void helper(char[] array, int index, List<String> result) {
        //recursion base case
        if (index == array.length) {
            result.add(new String(array));
            return;
        }
        for (int i = index; i < array.length; i++) {
            swap(array, i, index);
            helper(array, index + 1, result);
            swap(array, i, index);
        }
    }

    private void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
