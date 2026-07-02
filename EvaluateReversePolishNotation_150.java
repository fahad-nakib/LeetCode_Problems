import java.util.Stack;

class ERPN{
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (int i=0; i<tokens.length; i++){
            if (tokens[i].equals("+")){
                int a = stk.pop();
                int b = stk.pop();
                int ans = a+b;
                stk.push(ans);
                System.out.println("Current Stack : "+ stk);
            }else if(tokens[i].equals("-")){
                int a = stk.pop();
                int b = stk.pop();
                int ans = b-a;
                stk.push(ans);
                System.out.println("Current Stack : "+ stk);
            }else if(tokens[i].equals("*")){
                int a = stk.pop();
                int b = stk.pop();
                int ans = a*b;
                stk.push(ans);
                System.out.println("Current Stack : "+ stk);
            }else if(tokens[i].equals("/")){
                int a = stk.pop();
                int b = stk.pop();
                int ans = b/a;
                stk.push(ans);
                System.out.println("a = "+ a + " b = "+b + " ans = "+ ans);
                System.out.println("Current Stack : "+ stk);
            }else {
                stk.push(Integer.parseInt(tokens[i]));
                System.out.println("Current Stack : "+ stk);
            }
        }
        return stk.pop();
    }
}
public class EvaluateReversePolishNotation_150 {
    static void main() {
        String[] arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        ERPN erpn = new ERPN();
        erpn.evalRPN(arr);
    }
}
