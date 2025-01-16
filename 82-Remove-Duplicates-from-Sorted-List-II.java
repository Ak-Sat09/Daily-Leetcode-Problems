class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode One = dummy; // Acts as the \prev\ pointer
        ListNode Two = head;  // Acts as the \curr\ pointer

        while (Two != null) {
            // Check if the current node has duplicates
            if (Two.next != null && Two.val == Two.next.val) {
                // Skip all nodes with the same value
                while (Two.next != null && Two.val == Two.next.val) {
                    Two = Two.next;
                }
                // Point One.next to the node after the duplicates
                One.next = Two.next;
            } else {
                // No duplicates, move One forward
                One = One.next;
            }
            // Move Two forward
            Two = Two.next;
        }

        return dummy.next; // Return the new head
    }
}
