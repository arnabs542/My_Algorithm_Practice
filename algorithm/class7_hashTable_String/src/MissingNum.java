import java.util.HashSet;

/**
 * Given an integer array of size N - 1, containing all the numbers from 1 to N except one, find the missing number.

 Assumptions

 The given array is not null, and N >= 1
 Examples

 A = {2, 1, 4}, the missing number is 3
 A = {1, 2, 3}, the missing number is 4
 A = {}, the missing number is 1
 */
public class MissingNum {
    public int missing(int[] array) {
        //Solution1: use HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int number : array) {
            set.add(number);
        }

        for (int i = 1; i < array.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return array.length + 1;
    }
}
