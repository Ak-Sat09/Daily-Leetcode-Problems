class Solution {
    public String removeDuplicates(String str) {
        StringBuilder s = new StringBuilder();
        Stack<Character> stack = new Stack<>();


        for(char ch : str.toCharArray()){
            if(stack.size() >= 1 && ch == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }

        } 
        while (!stack.isEmpty()) {
            s.append(stack.pop());
        }
        return s.reverse().toString();
        
    }
}