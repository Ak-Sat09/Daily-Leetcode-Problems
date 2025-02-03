 class Solution {
    public String largestOddNumber(String str) {
        // Initialize result as an empty string
        String result = "";

        // Iterate through the string backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd digit
            if ((str.charAt(i) - '0') % 2 != 0) {
                // Return the substring from the start to the current position
                result = str.substring(0, i + 1);
                break;
            }
        }
        
        return result;
    }
}
