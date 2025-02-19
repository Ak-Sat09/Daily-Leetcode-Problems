 class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert string to numeric representation
        StringBuilder numStr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            numStr.append(ch - 'a' + 1);  // Using ASCII value
        }

        // Step 2: Sum digits k times
        int sum = 0;
        String digits = numStr.toString();
        while (k-- > 0) {
            sum = 0;
            for (char digit : digits.toCharArray()) {
                sum += digit - '0'; // Convert char to int
            }
            digits = String.valueOf(sum);
        }

        return sum;
    }
}
