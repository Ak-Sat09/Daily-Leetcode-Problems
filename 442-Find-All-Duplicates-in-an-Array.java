 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Count the occurrences of each element in the array
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find elements that occur exactly twice
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                list.add(key);
            }
        }

        return list;
    }
}
