 class Solution {
    public int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Start j from i + 1
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j}; // Return the indices
                }
            }
        }
        return null; // Return null if no solution is found
    }
}
