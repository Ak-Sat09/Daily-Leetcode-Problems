 class Solution {
    public ListNode modifiedList(int[] arr, ListNode head) {
        // Convert array to set for faster lookups
        Set<Integer> valuesToRemove = new HashSet<>();
        for (int val : arr) {
            valuesToRemove.add(val);
        }

        // Handle the head node
        while (head != null && valuesToRemove.contains(head.val)) {
            head = head.next; // Skip the head node
        }

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            // If the next node needs to be removed
            if (valuesToRemove.contains(curr.next.val)) {
                curr.next = curr.next.next; // Skip the node
            } else {
                curr = curr.next; // Move to the next node
            }
        }
        return head;
    }
}
