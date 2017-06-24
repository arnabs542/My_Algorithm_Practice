/**
 * Longest Substring Without Repeating Characters
 Given a string, find the longest substring without any repeating characters and return the length of it. The input string is guaranteed to be not null.

 For example, the longest substring without repeating letters for "bcdfbd" is "bcdf", we should return 4 in this case.
 */

import java.util.*;

public class LongestSubString {
    public int longest(String input) {
        Set<Character> set = new HashSet<>();
        int slow = 0;
        int fast = 0;
        int global_max = 0;
        while (fast < input.length()) {
            if (set.contains(input.charAt(fast))) {
                set.remove(input.charAt(slow));
                slow++;
            } else {
                set.add(input.charAt(fast));
                fast++;
                global_max = Math.max(global_max, fast - slow);
            }
        }
        return global_max;
    }
}
