/**
 * Time complexity
 * 将array分成一半的步骤：1+2+4+8+..+n = 2n, O(n)
 * combine成一个array的步骤：每层每个元素都需要比较，每层为O(n),一共log(n)层，总复杂度为O(n*log(n))
 * 两个复杂度较大的为O(n*log(n))，因此总复杂度为O(n*log(n))
 */

import java.util.*;

public class MergeSort2 {

    public List<Integer> mergeSort(int[] array) {
        //null check
        if (array == null || array.length == 0) {
            return null;
        }
        return  mergeSort(array, 0, array.length-1);
    }

    //Overload: two function has the same name but different parameters;返回值可以不一样
    public List<Integer> mergeSort(int[] array, int left, int right) {
        List<Integer> solution = new ArrayList<Integer>();
        //recursion basecase
        if (left==right) {
            solution.add(array[left]);
            return solution;
        }
        int mid = left + (right - left) / 2;
        List<Integer> solu_left = mergeSort(array,left,mid);
        List<Integer> solu_right = mergeSort(array,mid+1,right);
        solution = combine(solu_left,solu_right);
        return solution;
    }

    private List<Integer> combine(List<Integer> array1, List<Integer> array2) {
        List<Integer> solution = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<=array1.size()-1 && j <= array2.size()-1) {
            if (array1.get(i) <= array2.get(j)) {
                solution.add(array1.get(i));
                i++;
            } else {
                solution.add(array2.get(j));
                j++;
            }
        }
        //when out of the while loop, there must be 1 array not all traversed, check which one
        if (i==array1.size()) { //means array2 still have left elements not added into solution
            for (int k=j;k<array2.size();k++) {
                solution.add(array2.get(k));
            }
        }
        if (j==array2.size()) { //means array1 still have left elements not added into solution
            for (int t=i;t<array1.size();t++) {
                solution.add(array1.get(t));
            }
        }

        return solution;
    }

}
