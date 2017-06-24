/**
 * Online alg, can update the kth element online, streaming way, can dealwith data the same time
 */
import java.util.*;




public class TopKUnsortedArrayMaxHeap {

    private static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer i1, Integer i2) {
            if (i1.equals(i2)) return 0;
            return i1 > i2? -1:1;
        }
    }


    public int[] smallestKElementMaxHeap(int[] array, int k) {
        if (k==0) {
            return new int[0];
        }
        Queue<Integer> maxHeap = new PriorityQueue<Integer>(k, new MyComparator());
        for(int i=0; i<k;i++) {
            maxHeap.offer(array[i]);
        }
        for(int i=k;i<array.length;i++) {
            if(array[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }
        return toArray(maxHeap);
    }

    private int[] toArray(Queue<Integer> q) {
        int[] res = new int[q.size()];
        for(int i=res.length-1;i>=0;i--) {
            res[i] = q.poll();
        }
        return res;
    }

}

