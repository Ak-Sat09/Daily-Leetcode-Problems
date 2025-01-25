public class Solution {
    public boolean isPalindrome(String str) {
        // Step 1: Clean the input string (only consider alphanumeric characters)
        str = str.replaceAll(\[^a-zA-Z0-9]\, \\).toLowerCase();

        // Step 2: Use two-pointer technique to check if string is a palindrome
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // Return false if characters don't match
            }
            left++;
            right--;
        }

        return true;  // Return true if the string is a palindrome
    }
}
