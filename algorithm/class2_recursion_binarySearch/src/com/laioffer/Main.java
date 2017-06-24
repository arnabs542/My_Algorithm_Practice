package com.laioffer;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {

//        testFibo();
//        testPower();
//        testBinarySearch();
//        testFirstOccuBinarySearch();
//        testLastOccuBinarySearch();
//        testClosest();
        testKclosest();
//        testSearchSortedMatrix();

    }

    //test case: fibonacci number
    public static void testFibo() {
        Fibo solution = new Fibo();
        int a = 10;
        System.out.println(solution.fibonacci(a));

        int b = 0;
        System.out.println(solution.fibonacci(b));

        int c = -2;
        System.out.println(solution.fibonacci(c));
    }

    //test case: a to the power of b
    public static void testPower() {
        Power solution = new Power();
        int a = 0, b = 1;
        System.out.println(solution.power(a, b));

        a = 14;
        b = 3;
        System.out.println(solution.power(a, b));
    }

    // test binary search
    public static void testBinarySearch() {
        BinarySearch solution = new BinarySearch();
        int[] array1 = null;
        int target = 7;
        System.out.println(solution.binarySearch(array1, target));

        int[] array2 = new int[]{5};
        System.out.println(solution.binarySearch(array2, target));

        int[] array3 = new int[]{};
        System.out.println(solution.binarySearch(array3, target));

    }

    // test first occurance binary search
    public static void testFirstOccuBinarySearch() {
        FirstOccuBinarySearch solution = new FirstOccuBinarySearch();
        int[] array1 = null;
        int target = 4;
        System.out.println(solution.firstOccuBinarySearch(array1, target));

        int[] array2 = new int[]{5};
        int target2 = 5;
        System.out.println(solution.firstOccuBinarySearch(array2, target2));

    }

    //test last occurance binary search
    public static void testLastOccuBinarySearch() {
        LastOccuBinarySearch solution = new LastOccuBinarySearch();
        int[] array1 = null;
        int target = 4;
        System.out.println(solution.lastOccuBinarySearch(array1, target));

        int[] array2 = new int[]{5, 5, 5};
        int target2 = 5;
        System.out.println(solution.lastOccuBinarySearch(array2, target2));
    }

    // test closest
    public static void testClosest() {
        Closest solution = new Closest();
        int[] array1 = null;
        int target = 4;
        System.out.println(solution.closest(array1, target));

        int[] array2 = new int[]{1, 4, 6, 7, 8};
        int target2 = 5;
        System.out.println(solution.closest(array2, target2));
    }

    // test k closest
    public static void testKclosest() {
        KClosestEle solution = new KClosestEle();
        int[] array1 = {1, 5};
        int target = 10;
        int k = 2;
        int[] result = solution.kclosest(array1, target, k);
        for (int n: result){
            System.out.println(n);
        }
    }

    // test search sorted matrix
    public static void testSearchSortedMatrix() {
        SearchSortedMatrix solution = new SearchSortedMatrix();
        int[][] matrix1 = new int[][] {{1,2,3},{5,6,7},{8,9,10}};
        int target = 5;
        int[] result = solution.searchSortedMatrix(matrix1,target);
        for (int n : result) {
            System.out.println(n);
        }

    }




}
