import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinStack {
    List<Integer> stk;
    public MinStack() {
        stk = new ArrayList<>();
    }

    public void push(int val) {
        stk.add(val);
    }

    public void pop() {
        stk.removeLast();
    }

    public int top() {
        return stk.getLast();
    }

    public int getMin() {
        return Collections.min(stk);
    }
}
public class MinStack_155_2 {
    static void main() {

    }
}
