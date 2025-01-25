class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0; // Start of the sliding window
        Set<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            // If character at 'right' is already in the set, shrink the window from the left
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            seen.add(s.charAt(right));
            // Update the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
