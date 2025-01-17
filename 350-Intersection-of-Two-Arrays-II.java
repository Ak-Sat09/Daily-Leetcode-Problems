 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++; // Increment both pointers after finding a match
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++; // Increment pointer for arr1
            } else {
                j++; // Increment pointer for arr2
            }
        }

        int[] result = new int[list.size()];

        for (int k = 0; k < list.size(); k++) { // Correct loop condition
            result[k] = list.get(k);
        }

        return result;
    }
}
