import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Create a frequency map
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Use a max-heap (priority queue) to sort by frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );

        maxHeap.addAll(map.entrySet());

        // Step 3: Build the result string
        StringBuilder str = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();

            // Append the character `freq` times
            for (int i = 0; i < freq; i++) {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
