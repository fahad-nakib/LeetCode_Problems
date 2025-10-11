import java.util.Scanner;
import java.util.Stack;

public class QueueusingStacks_232 {
    Stack<Integer> stack ;
    Stack<Integer> tempStack ;
    public QueueusingStacks_232(){
        stack = new Stack<>();
        tempStack = new Stack<>();
    }
    public void push(int x) {
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        tempStack.push(x);
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueusingStacks_232 qs = new QueueusingStacks_232();
        while (true)
        {
            System.out.println("Current queue : ");
            System.out.println(qs.stack);
            System.out.println("1. Push in queue.");
            System.out.println("2. Pop in queue.");
            System.out.println("3. Top in queue.");
            System.out.println("4. Check empty queue.");
            System.out.println("Enter choice :");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Enter value :");
                    qs.push(sc.nextInt());
                    break;
                case 2 : qs.pop();break;
                case 3 :
                    System.out.println("Top element is : "+ qs.peek());
                    break;
                case 4 :
                    System.out.println("Empty status is : "+ qs.empty());
                    break;
            }
        }
    }
}
