 public class Solution {
    // Method to check if two strings are isomorphic
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        // Traverse both strings
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            // Check existing mappings
            if (map1.containsKey(c1) && map1.get(c1) != c2 || 
                map2.containsKey(c2) && map2.get(c2) != c1) {
                return false; // Mapping inconsistency
            }
            
            // Create or update mappings
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
        return true; // Strings are isomorphic
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String param_1 = \egg\;
        String param_2 = \add\;
        
        boolean result = solution.isIsomorphic(param_1, param_2);
        System.out.println(\Are the strings isomorphic? \ + result); // Expected: true
    }
}
