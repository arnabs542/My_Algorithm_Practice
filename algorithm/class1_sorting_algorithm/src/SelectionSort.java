/**
 * Time complexity
 * 1+2+3+4+...+n = n(n-1)/2; O(n^2)
 */
public class SelectionSort {
    public int[] selectionSort(int[] array) {
        //null check
        if (array==null || array.length == 0) {
            return array;
        }
        int size = array.length;
        int global, temp;
        for (int i=0; i<size-1; i++) {
            global = i;
            for (int j=i+1;j<size;j++) {
                if (array[j]<array[global]) {
                    global = j;
                }
            }
            temp = array[i];
            array[i] = array[global];
            array[global] = temp;
        }
        return array;
    }
}
