import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> queue;
    public void MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for (int i=0; i<queue.size(); i++){
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1. Push Element to queue.");
            System.out.println("2. Remove Element to queue.");
            System.out.println("3. Peek top Element to queue.");
            System.out.println("4. Check queue size.");
        }
    }
}
