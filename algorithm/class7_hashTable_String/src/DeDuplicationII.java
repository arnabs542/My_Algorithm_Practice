/**
 *
 Remove Adjacent Repeated Characters IV
 Repeatedly remove all adjacent, repeated characters in a given string from left to right.

 No adjacent characters should be identified in the final string.

 Examples

 "abbbaaccz" → "aaaccz" → "ccz" → "z"
 "aabccdc" → "bccdc" → "bdc"
 */

import java.util.*;

public class DeDuplicationII {
    //method1: this method use time O(n), space O(n)
    public String deDup(String input) {
        //null check
        if (input == null || input.length() <= 0) {
            return input;
        }
        int fast = 0;
        char[] array = input.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        while (fast < array.length) {
            if (!stack.isEmpty() && array[fast] == stack.peek()){
                while(fast < array.length && array[fast] == stack.peek()) {
                    fast++;
                }
                stack.pop();
            } else {
                stack.push(array[fast]);
                fast++;
            }
        }
        int size = stack.size();
        char[] result = new char[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }


    //method2: this method use space O(1), does not need extra stack to put the final result
    public String deDupInPlace(String input) {
        //null check
        if (input == null || input.length() <= 1) {
            return input;
        }
        char[] array = input.toCharArray();
        // we can use the left of the array as the stack, end points to the top of stack
        int end = 0;
        for (int i = 1; i < array.length; i++) {
            if (end == -1 || array[i] != array[end]) {
                end++;
                array[end] = array[i];
            } else {
                end--;
                while (i + 1 < array.length && array[i] == array[i+1]) {
                    i++;
                }
            }
        }
        return new String(array,0,end + 1);
    }

}
