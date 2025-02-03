 class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) { // If character is a digit
                numberSeen = true;
                numberAfterE = true;
            } else if (c == '.') { // If character is a decimal point
                if (pointSeen || eSeen) return false; // Decimal should not appear after 'e' or more than once
                pointSeen = true;
            } else if (c == 'e' || c == 'E') { // If character is 'e' or 'E' (scientific notation)
                if (eSeen || !numberSeen) return false; // 'e' must be preceded by a number and appear only once
                eSeen = true;
                numberAfterE = false; // Need at least one number after 'e'
            } else if (c == '+' || c == '-') { // If character is a sign (+ or -)
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false; // Sign can only appear at start or after 'e'
            } else { // Any other character is invalid
                return false;
            }
        }
        
        return numberSeen && numberAfterE; // Valid only if at least one number exists and numberAfterE is true
    }
}
