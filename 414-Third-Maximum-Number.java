 import java.util.*;

public class Solution {
    public int thirdMax(int[] nums) {
        // Use a TreeSet to automatically handle duplicates and maintain sorted order
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : nums) {
            set.add(num);
            // Keep only the top 3 elements
            if (set.size() > 3) {
                set.pollFirst(); // Remove the smallest element
            }
        }
        
        // If there are less than 3 distinct elements, return the maximum
        if (set.size() < 3) {
            return set.last(); // Maximum element
        }
        
        // Else return the third maximum
        return set.first(); // Third maximum element
    }
}
