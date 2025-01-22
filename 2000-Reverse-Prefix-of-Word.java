class Solution {
    
    public String reversePrefix(String word, char ch) {

            int index = word.indexOf(ch);
        
        // If the character is not found, return the word as is
        if (index == -1) {
            return word;
        }
        
        // Reverse the substring from 0 to the index (inclusive)
        String reversedPrefix = new StringBuilder(word.substring(0, index + 1)).reverse().toString();
        
        // Concatenate the reversed part with the rest of the string
        return reversedPrefix + word.substring(index + 1);
        
    }
}