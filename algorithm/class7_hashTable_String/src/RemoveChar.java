import java.util.*;

/**
 *
 Remove Certain Characters
 Remove given characters in input string, the relative order of other characters should be remained. Return the new string after deletion.

 Assumptions

 The given input string is not null.
 The characters to be removed is given by another string, it is guranteed to be not null.
 Examples

 input = "abcd", t = "ab", delete all instances of 'a' and 'b', the result is "cd".
 */


public class RemoveChar {
    public String remove(String input, String t) {
        //null and empty check
        if (input.isEmpty()) { return input; }
        char[] array = input.toCharArray();
        Set<Character> set = newSet(t);
        int slow = 0;
        int fast = 0;
        while (fast < array.length) {
            if (set.contains(array[fast])) {
                fast++;
            } else {
                array[slow] = array[fast];
                slow++;
                fast++;
            }
        }
        return new String(array,0,slow);
    }

    private Set<Character> newSet(String t) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            if (!result.contains(t)) {
                result.add(t.charAt(i));
            }
        }
        return result;

    }
}
