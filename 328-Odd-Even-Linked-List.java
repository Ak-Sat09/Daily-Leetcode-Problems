 class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;  // No change needed if list is empty or has only one node
        }

        ListNode odd = head;  // Head of the odd-indexed nodes
        ListNode even = head.next;  // Head of the even-indexed nodes
        ListNode evenHead = even;  // Save the head of the even-indexed nodes

        while (even != null && even.next != null) {
            odd.next = odd.next.next;  // Link to the next odd node
            even.next = even.next.next;  // Link to the next even node
            
            odd = odd.next;  // Move to the next odd node
            even = even.next;  // Move to the next even node
        }

        odd.next = evenHead;  // Connect the end of odd nodes list to the head of even nodes list
        return head;  // Return the rearranged list
    }
}
