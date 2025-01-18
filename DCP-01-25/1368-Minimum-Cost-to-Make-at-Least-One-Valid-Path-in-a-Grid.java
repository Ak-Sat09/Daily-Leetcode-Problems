 import java.util.*;

class Solution {
    class Tuple {
        int row, col, cost;
        public Tuple(int r, int c, int co) {
            row = r;
            col = c;
            cost = co;
        }
    }
    
    public int minCost(int[][] grid) {
        int rows = grid.length, columns = grid[0].length;
        int targetRow = rows - 1, targetColumn = columns - 1;

        // Keep track of the minimum cost to reach each cell
        int[][] minCost = new int[rows][columns];
        for (int[] row : minCost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minCost[0][0] = 0;

        // Priority queue for Dijkstra's algorithm
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new Tuple(0, 0, 0));

        // Directions for right, left, down, up
        int[] dRow = {0, 0, 1, -1};
        int[] dCol = {1, -1, 0, 0};
        
        while (!pq.isEmpty()) {
            Tuple top = pq.poll();
            int row = top.row, col = top.col, cost = top.cost;

            // If we reached the target, return the cost
            if (row == targetRow && col == targetColumn) {
                return cost;
            }

            // Try all 4 directions
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                // Check grid boundaries
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                    int newCost = cost + (grid[row][col] == i + 1 ? 0 : 1);  // No cost if direction matches
                    
                    // If we found a cheaper path to the new cell, update and add to priority queue
                    if (newCost < minCost[newRow][newCol]) {
                        minCost[newRow][newCol] = newCost;
                        pq.add(new Tuple(newRow, newCol, newCost));
                    }
                }
            }
        }

        return -1; // Return -1 if no valid path exists
    }
}
