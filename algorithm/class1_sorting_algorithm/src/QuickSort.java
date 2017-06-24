/**
 * Time complexity
 * Worst case:每次选择pivot都是array的最左边或者最右边，每次recursion都是O(n),总复杂度为O(n^2)
 * Average: O(n*log(n))
 */


public class QuickSort{

    public int[] quickSort(int[] array) {
        if (array==null || array.length==0) {return array;}
        quickSort(array, 0, array.length-1);
        return array;
    }

    public void quickSort(int[] array,int left, int right) {
        //recursion base case
        if (left>=right) { return;}
        int sortedPivot = partition(array,left,right);
        quickSort(array,left,sortedPivot-1);
        quickSort(array,sortedPivot+1,right);
    }

    private int partition(int[] array, int left, int right) {
        int pivotIndex = getRandom(left,right);
        int pivot = array[pivotIndex];
        swap(array,pivotIndex,right);
        int LB = left;
        int RB = right - 1;
        while (LB<=RB) {
            if (array[LB] <= pivot) {
                LB++;
            } else if (array[RB] > pivot) {
                RB--;
            } else { // condition: array[LB] > pivot && array[RB] <= pivot
                swap(array, LB++, RB--);
            }
        }
        swap(array,LB,right);
        return LB;
    }

    private int getRandom(int left, int right) {
        return left +(int) Math.random() * (right - left + 1);
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right]= temp;
    }
}
