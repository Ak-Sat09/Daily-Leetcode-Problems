import java.util.HashMap;

class Solution {
    public int singleNumber(int[] arr) {
        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array and update the frequency of each number in the map
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        // Find and return the number that has a frequency of 1
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        
        return -1; // This return is never expected in this problem (since we are guaranteed one element will appear once)
    }
}
