/**
 *
 Reverse Words In A Sentence I
 Reverse the words in a sentence.

 Assumptions

 Words are separated by single space

 There are no heading or tailing white spaces

 Examples

 “I love Google” → “Google love I”

 Corner Cases

 If the given string is null, we do not need to do anything.
 */


public class ReverseWords {
    public String reverserWords(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        char[] array = input.toCharArray();
        reverse(array,0,array.length - 1);

        //reverse each words in the string
        int left = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ' && (i == 0 || array[i - 1] == ' ')) {
                left = i;
            }
            if (array[i] != ' ' && (i == array.length - 1 || array[i + 1] == ' ')) {
                reverse(array,left,i);
            }
        }
        return new String(array);

    }

    private void reverse(char[] array, int left, int right) {
        while(left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
