class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to handle the case where the head itself needs to be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy; // Start from the dummy node
        
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
