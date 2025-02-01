 class MyHashMap {
    private class Node {
        int key, value;
        Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private Node[] map;
    private static final int SIZE = 1000;  // Set the size of the map
    
    public MyHashMap() {
        map = new Node[SIZE];
    }
    
    // Hash function to map a key to an index
    private int hash(int key) {
        return key % SIZE;
    }
    
    // Insert a key-value pair into the HashMap
    public void put(int key, int value) {
        int index = hash(key);
        if (map[index] == null) {
            map[index] = new Node(-1, -1);  // Create a dummy node to handle collisions
        }
        
        Node prev = map[index];
        while (prev.next != null) {
            if (prev.next.key == key) {
                prev.next.value = value;  // Update value if key exists
                return;
            }
            prev = prev.next;
        }
        
        prev.next = new Node(key, value);  // Add a new key-value pair at the end
    }
    
    // Retrieve the value associated with the key
    public int get(int key) {
        int index = hash(key);
        if (map[index] == null) {
            return -1;  // Key not found
        }
        
        Node prev = map[index];
        while (prev.next != null) {
            if (prev.next.key == key) {
                return prev.next.value;  // Return the value if the key is found
            }
            prev = prev.next;
        }
        
        return -1;  // Key not found
    }
    
    // Remove a key-value pair from the HashMap
    public void remove(int key) {
        int index = hash(key);
        if (map[index] == null) {
            return;  // Key does not exist
        }
        
        Node prev = map[index];
        while (prev.next != null) {
            if (prev.next.key == key) {
                prev.next = prev.next.next;  // Remove the node with the given key
                return;
            }
            prev = prev.next;
        }
    }
}
