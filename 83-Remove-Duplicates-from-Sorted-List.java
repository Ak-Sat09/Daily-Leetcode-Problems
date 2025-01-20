class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null; // Handle empty list case
        
        ListNode curr = head; // Pointer to traverse the list
        
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // Skip duplicate node
            } else {
                curr = curr.next; // Move to the next node
            }
        }
        return head; // Return the modified list
    }
}
