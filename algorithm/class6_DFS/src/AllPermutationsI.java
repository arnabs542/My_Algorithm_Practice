

import java.util.*;

public class AllPermutationsI {
    public List<String> permutationI(String s) {
        boolean[] visited = new boolean[s.length()];
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(s,sb,visited,result);
        return result;
    }

    private void dfs(String s, StringBuilder sb, boolean[] visited, List<String> result) {
        //base case
        if (sb.length() == s.length()) {
            result.add(sb.toString());
            return;
        }
        //recursive rule
        for (int i=0;i<s.length();i++) {
            if (!visited[i]) {
                sb.append(s.charAt(i));
                visited[i] = true;
                dfs(s, sb, visited, result);
                visited[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }




    public List<String> permutationII(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) {
            return result;
        }
        char[] array = s.toCharArray();
        int index = 0;
        recur(array,index,result);
        return result;
    }

    private void recur(char[] array, int index, List<String> result) {
        if (index == array.length) {
            result.add(new String(array));
            return;
        }
        for (int i = index; i < array.length; i++) {
            swap(array, index, i);
            recur(array,index + 1, result);
            swap(array, index, i);
        }
    }

    private void swap(char[] array, int index, int i) {
        char temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }



}
