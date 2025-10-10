import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {
    private Queue<Integer> queue;
    public  StackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for (int i=1; i<queue.size(); i++){
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        if (queue.isEmpty()){
            return -1;
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingQueue sq = new StackUsingQueue();
        while (true){
            System.out.println("Current stack : ");
            System.out.println(sq.queue);
            System.out.println("Enter the choice : ");
            System.out.println("1. Push Element to queue.");
            System.out.println("2. Remove Element to queue.");
            System.out.println("3. Peek top Element to queue.");
            System.out.println("4. Check queue size.");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter value : ");
                    sq.push(sc.nextInt());
                    break;
                case 2 : sq.pop(); break;
                case 3 :
                    System.out.println(sq.top()); break;
                case 4 :
                    System.out.println(sq.empty()); break;
            }
        }
    }
}
