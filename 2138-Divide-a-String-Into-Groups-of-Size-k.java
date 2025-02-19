 import java.util.*;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        
        // If the string is not a multiple of k, append fill characters
        while (n % k != 0) {
            s += fill;
            n++;
        }
        
        // Calculate the number of groups
        int groups = n / k;
        String[] result = new String[groups];

        // Divide the string into groups of size k
        for (int i = 0; i < groups; i++) {
            result[i] = s.substring(i * k, (i + 1) * k);
        }
        
        return result;
    }
}
