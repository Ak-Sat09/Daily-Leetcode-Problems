public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the result list construction
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null) {
            // Get the values from the current nodes (if available)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum of the two digits and the carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Update carry
            current.next = new ListNode(sum % 10); // Create a new node with the digit
            current = current.next; // Move the current pointer

            // Move to the next nodes in the input lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's any carry left, create a new node for it
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next of dummy head since dummy head is a placeholder
        return dummyHead.next;
    }
}
