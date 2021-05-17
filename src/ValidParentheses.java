import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
       if(s.length() % 2 != 0) return false;
       Stack<Character> stack = new Stack<Character>();
       char[] chars = s.toCharArray();
       for(char c : chars){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
       }
       return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean val = isValid("()[]{}");
        System.out.println(val);
    }
}
