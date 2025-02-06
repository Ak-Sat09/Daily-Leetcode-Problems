 import java.util.HashMap;

public class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productMap = new HashMap<>();
        int count = 0;
        
        // Step 1: Calculate the product for each pair and store it in a hash map
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }

        // Step 2: Calculate the number of valid quadruplets from the product map
        for (int key : productMap.keySet()) {
            int pairsCount = productMap.get(key);
            // For each product, if there are `pairsCount` pairs, choose two distinct pairs (combinatorics)
            if (pairsCount > 1) {
                count += pairsCount * (pairsCount - 1) / 2;
            }
        }

        // Each valid quadruplet (a, b, c, d) is counted 8 times (since (a, b) and (c, d) can be swapped)
        return count * 8;
    }
}
