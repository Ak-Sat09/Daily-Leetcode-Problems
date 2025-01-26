 

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create a HashMap to store the mapping of original nodes to cloned nodes
        HashMap<Node, Node> map = new HashMap<>();

        // Step 2: First pass - create all nodes and store in the map
        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.val)); // Map original -> cloned node
            current = current.next;
        }

        // Step 3: Second pass - set up `next` and `random` pointers
        current = head;
        while (current != null) {
            Node clonedNode = map.get(current); // Get the cloned node
            clonedNode.next = map.get(current.next); // Set the `next` pointer
            clonedNode.random = map.get(current.random); // Set the `random` pointer
            current = current.next; // Move to the next node
        }

        // Step 4: Return the head of the cloned list
        return map.get(head);
    }
}
