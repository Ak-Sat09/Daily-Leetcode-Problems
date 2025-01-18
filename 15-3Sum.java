 import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array first

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            // Two-pointer approach to find pairs that sum to the target
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move pointers to avoid duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Increase the sum by moving the left pointer
                } else {
                    right--; // Decrease the sum by moving the right pointer
                }
            }
        }

        return result;
    }
}
