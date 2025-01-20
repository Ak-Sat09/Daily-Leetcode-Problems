class Solution {
    public int minPairSum(int[] nums) {
     Arrays.sort(nums);

        int maxPairSum = 0;
        int i = 0; // Start pointer
        int j = nums.length - 1; // End pointer

        // Step 2: Use two pointers to find pair sums
        while (i < j) {
            int pairSum = nums[i] + nums[j]; // Pair smallest and largest
            maxPairSum = Math.max(maxPairSum, pairSum); // Update max pair sum
            i++; // Move left pointer inward
            j--; // Move right pointer inward
        }

        return maxPairSum;
    }
}