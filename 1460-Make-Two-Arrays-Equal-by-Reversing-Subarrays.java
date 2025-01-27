 import java.util.HashMap;

class Solution {
    public boolean canBeEqual(int[] arr, int[] arr2) {
        // Edge case: Check if lengths are different
        if (arr.length != arr2.length) {
            return false;
        }

        // Use a HashMap to store frequencies of elements in `arr`
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Check elements in `arr2` against the map
        for (int i : arr2) {
            if (!map.containsKey(i) || map.get(i) == 0) {
                return false; // Either `i` is missing or its frequency is mismatched
            }
            map.put(i, map.get(i) - 1); // Decrease the count for matched elements
        }

        return true; // Arrays can be made equal
    }
}
