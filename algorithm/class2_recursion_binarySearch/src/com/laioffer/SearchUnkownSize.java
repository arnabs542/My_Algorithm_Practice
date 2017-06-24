package com.laioffer;

/**
 * Created by xiangyuli on 3/14/17.
 */
public class SearchUnkownSize {
//    public int search(Dictionary array, int target) {
//        //null check
//        if (target == null || array == null) {
//            return -1;
//        }
//        int left = 0;
//        int right = 1;
//        while (array.get(i) != null && array.get(i) < target) {
//            left = right;
//            right = 2 * right;
//        }
//        return binarySearch(array, target, left, right);
//    }
//
//    private int binarySearch (Dictionary array, int target, int left, int right) {
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
////第一个if一定要先判断array.get(mid) == null,否则会出现nullPointerException, 如果先判断array.get(mid) == target，在array == null的时候，会的reference null, 出现exception
//    //there will be NPE if call < and > on Integer which is null!!!
//            if (array.get(mid) == null || array.get(mid) > target) {
//                right = mid - 1;
//            } else if (array.get(mid) == target) {
//                return mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }
}
