
public class Test {
    public static void main(String[] args) {
        DictionaryWord solution = new DictionaryWord();
        String input = new String("robcatbob");
        String[] dict = new String[]{"bob", "cat", "rob"};
        boolean result = solution.canBreak(input,dict);
        System.out.println(result);

    }
}
