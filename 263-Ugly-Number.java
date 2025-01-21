 class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false; // Ugly numbers must be positive
        }
        
        // Continuously divide n by 2, 3, or 5 if it's divisible
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        
        // If the remaining number is 1, it's an ugly number
        return n == 1;
    }
}
