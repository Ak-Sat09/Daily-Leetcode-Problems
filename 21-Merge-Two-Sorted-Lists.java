 import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a List to hold values from both linked lists
        List<Integer> values = new ArrayList<>();
        
        // Add values from the first list to the list
        while (list1 != null) {
            values.add(list1.val);
            list1 = list1.next;
        }
        
        // Add values from the second list to the list
        while (list2 != null) {
            values.add(list2.val);
            list2 = list2.next;
        }
        
        // Sort the values
        values.sort(null);
        
        // Create a dummy node to help build the new list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Add nodes from the sorted values list to the new linked list
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        // Return the merged and sorted linked list starting from the first node
        return dummy.next;
    }
}
