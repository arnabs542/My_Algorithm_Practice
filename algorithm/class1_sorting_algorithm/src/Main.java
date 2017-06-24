import java.util.*;


public class Main {

    public static void main(String[] args) {
//        selectionSort();
//        testMergeSort();
//        testQuickSort();
//        testRainbowSort();
        testMoveZero();
    }

    private static void selectionSort() {
        SelectionSort solution = new SelectionSort();
        int[] array = null;
        int[] result = solution.selectionSort(array);
        System.out.println(Arrays.toString(result));
        int[] array1 = new int[] {3,3,3,3,3,6,7,2,1,1,1,6,8,9,11};
        int[] result1 = solution.selectionSort(array1);
        System.out.println(Arrays.toString(result1));

        int[] array2 = new int[] {3};
        int[] result2 = solution.selectionSort(array2);
        System.out.println(Arrays.toString(result2));

    }

    private static void testMergeSort() {
        MergeSort2 solution = new MergeSort2();
        int[] array1 = new int[] {3,3,3,3,3,6,7,2,1,1,1,6,8,9,11};
        List<Integer> result1 = solution.mergeSort(array1);
        System.out.println(result1); //[1, 1, 1, 2, 3, 3, 3, 3, 3, 6, 6, 7, 8, 9, 11]

        int[] array2 = null;
        List<Integer> result2 = solution.mergeSort(array2);
        System.out.println(result2); //null

        int[] array3 = new int[]{};
        List<Integer> result3 = solution.mergeSort(array3);
        System.out.println(result3); //null

        int[] array4 = new int[]{1,3,2};
        List<Integer> result4 = solution.mergeSort(array4);
        System.out.println(result4); //[1, 2, 3]

    }

    private static void testQuickSort() {
        QuickSort solution = new QuickSort();
        int[] array1 = new int[]{3,3,3,4,4,2,1};
        int[] result1 = solution.quickSort(array1);
        for (int i = 0; i<result1.length;i++) {
            System.out.println(result1[i]);
        }
    }

    private static void testRainbowSort() {
        RainbowSort solution = new RainbowSort();
        int[] array = new int[30];
        Random random = new Random();
        for (int i=0;i< array.length;i++) {
            array[i] = random.nextInt(3) - 1;;
        }
        int[] result1 = solution.rainbowSort(array);
        for (int i = 0; i<result1.length;i++) {
            System.out.println(result1[i]);
        }
    }

    private static void testMoveZero() {
        Move0sToEnd solution = new Move0sToEnd();
        int[] array = new int[30];
        Random random = new Random();
        for (int i=0;i< array.length;i++) {
            array[i] = random.nextInt(10);
        }
        int[] result1 = solution.moveZero(array);
        for (int i = 0; i<result1.length;i++) {
            System.out.println(result1[i]);
        }
    }



}
