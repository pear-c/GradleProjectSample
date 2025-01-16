package stack;

import java.util.Stack;

public class StackQuizOne {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            // 여는 괄호는 push
            if(ch == '(') {
                stack.push(ch);
            } else if(ch == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
            }
            stack.pop();
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

    }
}
