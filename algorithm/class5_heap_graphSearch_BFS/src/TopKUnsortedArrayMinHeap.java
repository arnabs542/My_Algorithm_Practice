import java.util.PriorityQueue;

/**
 * offline alg, has to import all data and then find the kth
 */
public class TopKUnsortedArrayMinHeap {
    public static int[] smallestKElementMinHeal(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i =0;i<array.length;i++) {
            minHeap.offer(array[i]);
        }
        int[] result = new int[k];
        for (int i=0;i<k;i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
