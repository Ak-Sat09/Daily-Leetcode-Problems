 import java.util.*;

class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1; // Single element sequence

        // Step 1: Add elements to a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Step 2: Convert HashSet to an array and sort it
        int[] res = new int[set.size()];
        int index = 0;
        for (int num : set) {
            res[index++] = num;
        }
        Arrays.sort(res);

        // Step 3: Traverse the sorted array to find the longest consecutive sequence
        int currMax = 1, longestStreak = 1;
        for (int i = 1; i < res.length; i++) {
            if (res[i] - res[i - 1] == 1) {
                currMax++;
            } else {
                longestStreak = Math.max(longestStreak, currMax);
                currMax = 1;
            }
        }
        return Math.max(longestStreak, currMax);
    }
}
