 public class Solution {
    public int numSquares(int n) {
        // Check if n is a perfect square
        if (isPerfectSquare(n)) return 1;

        // Check if the result is 2
        for (int i = 1; i * i <= n; i++) {
            if (isPerfectSquare(n - i * i)) return 2;
        }

        // Check if the result is 4 (Lagrange's Four Square Theorem)
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) return 4;

        return 3; // Otherwise, the result is 3
    }

    private boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    
}
