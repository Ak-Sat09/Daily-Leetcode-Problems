class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy; 
        
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next; // Skip the node with the value
            } else {
                curr = curr.next; // Move to the next node
            }
        }
        
        return dummy.next; // Return the new head (could be different if original head was removed)
    }
}
