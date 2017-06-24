/**
 *
 Remove Spaces
 Given a string, remove all leading/trailing/duplicated empty spaces.

 Assumptions:

 The given string is not null.
 Examples:

 “  a” --> “a”
 “   I     love MTV ” --> “I love MTV”
 */

public class RemoveSpace {
    public String removeSpaces(String input) {
        //empty check
        if (input.isEmpty()) { return input; }
        char[] array = input.toCharArray();
        int slow = 0;
        int fast = 0;
        int word_count = 0;
        while (fast < array.length) {
            while (fast < array.length && array[fast] == ' ') {
                fast++;
            }
            if (fast == array.length) {
                break;
            }
            if (word_count > 0) {
                array[slow] = ' ';
                slow++;
            }
            while (fast < array.length && array[fast] != ' ') {
                array[slow] = array[fast];
                slow++;
                fast++;
            }
            word_count++;
        }
        return new String(array,0,slow);
    }
}


