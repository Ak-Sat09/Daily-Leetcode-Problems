 import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int[] row : grid) {
            Arrays.sort(row);  // Step 1: Sort each row
        }

        int scoreSum = 0;
        for (int col = n - 1; col >= 0; col--) {  // Step 2: Iterate columns from right to left
            int maxInCol = 0;
            for (int row = 0; row < m; row++) {
                maxInCol = Math.max(maxInCol, grid[row][col]);
            }
            scoreSum += maxInCol;  // Step 3: Add to total score
        }
        return scoreSum;
    }
}
