 class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Detect the intersection point in the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];       // Move slow pointer by 1 step
            fast = nums[nums[fast]]; // Move fast pointer by 2 steps
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // The duplicate number
    }
}
