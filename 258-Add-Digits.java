 class Solution {
    public int addDigits(int n) {
        while (n >= 10) { // Repeat until `n` becomes a single-digit number
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }
            n = sum; // Update `n` to the computed sum
        }
        return n; // Return the single-digit result
    }
}
