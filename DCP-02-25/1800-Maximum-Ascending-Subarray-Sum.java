 class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr = nums[0];  // Start with first element
        int maxSum = curr;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                curr += nums[i];  // Add the current number to sum
            } else {
                maxSum = Math.max(curr, maxSum);  // Update maxSum
                curr = nums[i];  // Reset to the current number
            }
        }
        maxSum = Math.max(curr, maxSum);  // Final check
        return maxSum;
    }
}
