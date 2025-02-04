class Solution {
    public ListNode removeNodes(ListNode head) {

        ListNode curr = head;

        Stack<ListNode> stack = new Stack<>();

        while(curr != null){
            while(!stack.isEmpty() && stack.peek().val < curr.val){
                stack.pop();
            }
            stack.push(curr);
            curr = curr.next;
        }

        ListNode next = null;
        while(!stack.isEmpty()){
            curr = stack.pop();
            curr.next = next;
            next = curr;
        }
       

  return curr;  
    }
}