/**
 * Created by xiangyuli on 3/28/17.
 */

import java.util.*;

public class AllSubsetI {
    public List<String> subSets(String set) {
        List<String> result = new ArrayList<String>();
        if (set == null) {
            return result;
        }
        //record the current subset
        StringBuilder sb = new StringBuilder();
        helper(set, sb, 0, result);
        return result;
    }

    private void helper(String set, StringBuilder sb, int index, List<String> result) {
        //base case
        // when we finish determining for all the characters pick or not, we have a complete subset
        if (index == set.length()) {
            result.add(sb.toString());
            return;
        }
        //1. not pick the character at index
        helper(set,sb,index+1,result);
        //2.pick the character at index

        sb.append(set.charAt(index));
        helper(set,sb,index+1,result);
        sb.deleteCharAt(sb.length()-1);


    }
}
