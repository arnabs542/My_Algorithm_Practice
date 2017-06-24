/**
 Common Numbers Of Two Sorted Arrays
 Find all numbers that appear in both of two sorted arrays (the two arrays are all sorted in ascending order).

 Assumptions

 In each of the two sorted arrays, there could be duplicate numbers.
 Both two arrays are not null.
 Examples

 A = {1, 1, 2, 2, 3}, B = {1, 1, 2, 5, 6}, common numbers are [1, 1, 2]
 */
import java.util.*;

public class CommonNums {
    public List<Integer> common(List<Integer> A, List<Integer> B) {
        //empty check
        if (A == null || B == null || A.size() == 0 || B.size() == 0) {
            return new ArrayList<Integer>(0);
        }
        Map<Integer, Integer> mapA = freqMap(A);
        Map<Integer, Integer> mapB = freqMap(B);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mapA.entrySet()) {
            Integer mapBCount = mapB.get(entry.getKey());
            if (mapBCount != null) {
                int count = Math.min(mapBCount,entry.getValue());
                for (int i = 0; i < count; i++) {
                    result.add(entry.getKey());
                }
            }
        }
        return result;
    }


    private Map<Integer, Integer> freqMap(List<Integer> input) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer i : input) {
            if (result.containsKey(i)) {
                result.put(i,result.get(i) + 1);
            } else {
                result.put(i, 1);
            }
        }
        return result;
    }
}
