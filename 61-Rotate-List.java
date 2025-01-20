 class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // Calculate the length of the linked list
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        
        // Connect the tail to the head to form a circular list
        current.next = head;
        
        // Normalize k to avoid unnecessary rotations
        k = k % length;
        int stepsToNewHead = length - k;
        
        // Find the new tail and break the circle
        ListNode newTail = current;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}
