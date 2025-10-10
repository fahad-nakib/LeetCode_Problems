import java.util.Scanner;
import java.util.Stack;

public class MinStack_155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack_155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
    }

    public void pop() {
        int val = stack.pop();
        if (val == minStack.peek()) minStack.pop();
    }

    public int top() {
        //if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack_155 ms = new MinStack_155();
        while (true)
        {
            System.out.println("Current Stack : ");
            System.out.println(ms.stack);
            System.out.println("1. Push in stack.");
            System.out.println("2. Pop in stack.");
            System.out.println("3. Top in stack.");
            System.out.println("4. GetMin in stack.");
            System.out.println("Enter choice :");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Enter value :");
                    ms.push(sc.nextInt());
                    break;
                case 2 : ms.pop();break;
                case 3 :
                    System.out.println("Top element is : "+ ms.top());
                    break;
                case 4 :
                    System.out.println("Minimum element is : "+ ms.getMin());
                    break;
            }
        }
    }
}
