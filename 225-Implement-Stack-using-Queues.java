 import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll()); // Rotate queue
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
