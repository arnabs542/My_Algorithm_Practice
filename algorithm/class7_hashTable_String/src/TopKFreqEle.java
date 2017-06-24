import java.util.*;


/**
 * Given a composition with different kinds of words, return a list of the top K most frequent words in the composition.
 Assumptions
 the composition is not null and is not guaranteed to be sorted
 K >= 1 and K could be larger than the number of distinct words in the composition, in this case, just return all the distinct words
 Return
 a list of words ordered from most frequent one to least frequent one (the list could be of size K or smaller than K)
 Examples
 Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 2 frequent words are [“b”, “c”]
 Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 4 frequent words are [“b”, “c”, "a", "d"]
 Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 5 frequent words are [“b”, “c”, "a", "d"]

 */

public class TopKFreqEle {
    public String[] topKFrequent(String[] combo, int k) {
        //null check
        if (combo == null || combo.length == 0 || k <= 0) {
            return new String[0];
        }
        //step1:read the composition, and count the frequency of each work using hashmap
        Map<String,Integer> map = freqMap(combo);
        //step2: using maxHeap to find the most frequent word
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2) {
                if (entry1.getValue() == entry2.getValue()) {
                    return 0;
                }
                return entry1.getValue() < entry2.getValue()? -1 : 1;
            }
        });

        // put the first k element in the map into minHeap,
        // from the k+1th to nth element, if the freq is higher than minHeap.peek, put it into the minHeap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            } else if (entry.getValue() > minHeap.peek().getValue()) {
                minHeap.poll();
                minHeap.offer(entry);
            }
        }

        //return the result in a string array
        return toArray(minHeap);

    }

    private Map<String, Integer> freqMap(String[] combo) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < combo.length; i++) {
            if (map.containsKey(combo[i])) {
                map.put(combo[i],map.get(combo[i])+1);
            } else {
                map.put(combo[i],1);
            }
        }
        return map;
    }

    private String[] toArray(PriorityQueue<Map.Entry<String,Integer>> minHeap) {
        String[] result = new String[minHeap.size()];
        for (int i = minHeap.size() - 1; i >= 0; i--) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
}
