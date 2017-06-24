/**
 * Created by xiangyuli on 4/11/17.
 * All Permutations II
 Given a string with possible duplicate characters, return a list with all permutations of the characters.

 Examples

 Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]
 Set = "aba", all permutations are ["aab", "aba", "baa"]
 Set = "", all permutations are [""]
 Set = null, all permutations are []
 */
import java.util.*;

public class AllPermutationDup {
    public List<String> permutations(String set) {
        List<String> result = new ArrayList<>();
        // null and empty check
        if (set == null || set.length() == 0) {
            return result;
        }

        char[] array = set.toCharArray();
        recursion(array,0,result);
        return result;
    }

    private void recursion(char[] array, int index, List<String> result) {
        //base case
        if (index == array.length) {
            result.add(new String(array));
            return;
        }

        //recursive rule
        Set<Character> distinct = new HashSet<>();
        for (int i = index; i < array.length; i++) {
            if (!distinct.contains(array[i])) {
                distinct.add(array[i]);
                swap(array, i, index);
                recursion(array,index + 1, result);
                swap(array, i, index);
            }
        }
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
