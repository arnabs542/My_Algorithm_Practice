import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by xiangyuli on 5/1/17.
 */
public class ElementDedup {
    //Q1:sorted array, 消除重复元素，对于重复元素，只保留1个
    //EX: {1, 2, 2, 3, 3, 3} → {1, 2, 3}
    //slow: all element to the left handside of slow are all the result to return(including slow)
    //fast: current index to interate
    public int[] DedupI(int[] array) {
        //null check
        if (array.length <= 1) {
            return array;
        }
        int slow = 0;
        int fast = 1;
        while (fast < array.length) {
            if (array[slow] == array[fast]) {
                fast++;
            } else {
                array[++slow] = array[fast];
                fast++;
            }
        }
        return Arrays.copyOf(array, slow + 1);
    }
    //Q2:sorted array, 消除重复元素，对于重复元素，最多只保留2个
    //EX: {1, 2, 2, 3, 3, 3} → {1, 2, 2, 3, 3}
    public int[] DedupIISol1(int[] array) {
        //slow: all element to the left hand side of slow are all the result to return(including slow)
        //fast: current index to interate
        if (array == null || array.length <= 2) {
            return array;
        }
        int slow = 0;
        int counter = 1;
        for (int fast = 1; fast < array.length; fast++) {
            if (array[fast] == array[slow]) {
                if (counter < 2) {
                    array[++slow] = array[fast];
                    counter++;
                }
            } else {
                array[++slow] = array[fast];
                counter = 1;
            }
        }
        return Arrays.copyOf(array, slow + 1);
    }

    public int[] DedupIISol2(int[] array) {
        //slow: all element to the left hand side of slow are all the result to return(NOT including slow)
        //fast: current index to interate
        if (array == null || array.length <= 2) {
            return array;
        }
        int slow = 2;
        for (int fast = 2; fast < array.length; fast++) {
            if (array[fast] == array[slow - 2]) {
                continue;
            }
            array[slow++] = array[fast];
        }
        // int[] result = new int[slow];
        // for (int i = 0; i < slow; i++) {
        //   result[i] = array[i];
        // }
        // return result;
        return Arrays.copyOf(array, slow);
    }

    //Q3:sorted array, 消除重复元素，对于重复元素，最多只保留k个
    public int[] DedupIII(int[] array, int k) {
        //slow: all element to the left hand side of slow are all the result to return(NOT including slow)
        //fast: current index to interate
        if (array == null || array.length <= k) {
            return array;
        }
        int slow = k;
        for (int fast = k; fast < array.length; fast++) {
            if (array[fast] == array[slow - k]) {
                continue;
            }
            array[slow++] = array[fast];
        }
        // int[] result = new int[slow];
        // for (int i = 0; i < slow; i++) {
        //   result[i] = array[i];
        // }
        // return result;
        return Arrays.copyOf(array, slow);
    }

    //Q4:sorted array, 消除重复元素，对于重复元素，都不保留
    //EX: {1, 2, 2, 3, 3, 3} → {1}
    public int[] DedupIV(int[] array) {
        //slow: all element to the left hand side of slow are all the result to return(including slow)
        //fast: current index to interate
        if (array == null || array.length <= 1) {
            return array;
        }
        int slow = 0;
        int fast = 0;
        while (fast < array.length) {
            int fastBegin = fast;
            while (fast < array.length && array[fast] == array[fastBegin]) {
                fast++;
            }
            if (fast - fastBegin == 1) {
                array[slow++] = array[fastBegin];
            }
        }
        return Arrays.copyOf(array, slow);
    }




}
