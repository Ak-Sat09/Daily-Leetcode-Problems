import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        // Step 1: Build the frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a max heap (priority queue) to store elements by their frequencies
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()  // Comparator to order by frequency in descending order
        );

        // Step 3: Add all entries from the map to the max heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.offer(entry);
        }

        // Step 4: Extract the top k frequent elements
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = maxHeap.poll().getKey();  // Extract the key (the element itself)
        }

        // Step 5: Return the result
        return res;
    }
}
