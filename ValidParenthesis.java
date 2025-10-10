import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++)
        {
            char stringChar = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(stringChar);
            }else {
                char stkChar = stack.peek();
                if (stkChar == ')' || stkChar =='}' || stkChar == ']') return false;
                if (stkChar == '(' && stringChar == ')'){
                    stack.pop();
                } else if (stkChar == '{' && stringChar == '}') {
                    stack.pop();
                } else if (stkChar == '[' && stringChar == ']') {
                    stack.pop();
                }else {
                    stack.push(stringChar);
                }
            }
        }
        return ((stack.isEmpty()) ? true : false);
    }
    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        String s1 = "()";
        System.out.println(vp.isValid(s1));
        String s2 = "()[]{}";
        System.out.println(vp.isValid(s2));
        String s3 = "(]";
        System.out.println(vp.isValid(s3));
        String s4 = "([])";
        System.out.println(vp.isValid(s4));
        String s5 = "([)]";
        System.out.println(vp.isValid(s5));
        String s6 = "](){}[]";
        System.out.println(vp.isValid(s6));
    }
}
