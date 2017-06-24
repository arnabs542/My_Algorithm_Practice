import java.util.*;

/**
 * CGiven a word and a dictionary, determine if it can be composed by concatenating words from the given dictionary.

 Assumptions

 The given word is not null and is not empty
 The given dictionary is not null and is not empty and all the words in the dictionary are not null or empty
 Examples

 Dictionary: {“bob”, “cat”, “rob”}

 Word: “robob” return false

 Word: “robcatbob” return true since it can be composed by "rob", "cat", "bob"
 */


public class DictionaryWord {
    public boolean canBreak(String input, String[] dict) {
        Set<String> dictSet = new HashSet<>();
        for (String s : dict) {
            dictSet.add(s);
        }
        boolean[] result = new boolean[input.length() + 1];
        result[0] = true;
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (result[j] && dictSet.contains(input.substring(j,i))) {
                    result[i] = true;
                    break;
                }

            }

        }
        return result[result.length - 1];
    }
}
