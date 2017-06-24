/**
 * Created by xiangyuli on 4/3/17.
 */
public class RainbowSort {
    public int[] rainbowSort(int[] array) {
        if (array==null||array.length==0) {
            return array;
        }
        int neg = 0;
        int zero = 0;
        int one = array.length - 1;
        while (zero<=one) {
            if (array[zero]==-1) {
                swap(array,neg,zero);
                neg++;
                zero++;
            } else if (array[zero]==0) {
                zero++;
            } else {
                swap(array,zero,one);
                one--;
            }
        }
        return array;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
