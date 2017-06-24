/**
 * Created by xiangyuli on 3/28/17.
 */
import java.util.*;
public class Test {
    public static void main(String[] args) {
//        String input = new String("abc");
//        AllSubsetI solution = new AllSubsetI();
//        List<String> result = solution.subSets(input);
//        System.out.println(result);


        String input = new String("abc");
        AllPermutationsI solution = new AllPermutationsI();
        List<String> result = solution.permutationII(input);
        System.out.println(result);

//        int[] coins = new int[]{25,10,5,1};
//        int[] sol = new int[4];
//        Combination solution = new Combination();
//        solution.combination(99,coins,0,sol);
//
//        OrderPermutation solution = new OrderPermutation();
//        List<String> result = solution.getPermutation(3);
//        System.out.println(result);


    }
}
