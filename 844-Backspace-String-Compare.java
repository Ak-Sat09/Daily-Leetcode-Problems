 import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack1.isEmpty()) stack1.pop();
            } else {
                stack1.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!stack2.isEmpty()) stack2.pop();
            } else {
                stack2.push(ch);
            }
        }

        // Instead of popping from stacks and appending, use StringBuilder from the start
        for (char ch : stack1) str1.append(ch);
        for (char ch : stack2) str2.append(ch);

        return str1.toString().equals(str2.toString());
    }
}
