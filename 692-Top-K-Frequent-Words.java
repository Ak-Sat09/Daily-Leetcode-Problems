 import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count the frequency of each word
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: Use a priority queue (min-heap)
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            // Compare by frequency first (ascending)
            if (!map.get(a).equals(map.get(b))) {
                return map.get(a) - map.get(b);
            }
            // If frequencies are equal, compare lexicographically (descending)
            return b.compareTo(a);
        });

        // Step 3: Add words to the priority queue
        for (String word : map.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll(); // Remove the least frequent element
            }
        }

        // Step 4: Build the result list from the priority queue
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        // Reverse the list to get the most frequent words first
        Collections.reverse(result);
        return result;
    }
}
