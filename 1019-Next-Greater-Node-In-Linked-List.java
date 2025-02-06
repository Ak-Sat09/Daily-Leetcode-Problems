 class Solution {
    public int[] sortedSquares(int[] arr) {
        int j = arr.length - 1; // Initialize the pointer to the last index
        int i = 0;             // Initialize the pointer to the first index
        int res[] = new int[arr.length]; // Resultant array to store sorted squares

        for (int k = arr.length - 1; k >= 0; k--) { // Fill the result array from the end
            int comp1 = arr[i] * arr[i];
            int comp2 = arr[j] * arr[j];

            if (comp1 > comp2) {
                res[k] = comp1; // Place the larger square at the current position
                i++;            // Move the left pointer to the right
            } else {
                res[k] = comp2; // Place the larger square at the current position
                j--;            // Move the right pointer to the left
            }
        }
        return res;
    }
}
