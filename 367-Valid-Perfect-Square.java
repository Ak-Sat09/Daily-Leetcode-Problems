 class Solution {
    public boolean isPerfectSquare(int n) {
        if (n == 1) return true; // 1 is a perfect square
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // Use long to prevent overflow

            if (square == n) return true;
            if (square < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
