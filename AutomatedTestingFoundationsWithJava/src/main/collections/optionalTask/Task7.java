package main.collections.optionalTask;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task7 {
    
    public static void main(String[] args) {
        
        String rightString = "({asd}fg)[f]";
        String wrongString = "{}(HL}{{";
    
        System.out.println(checkCorrectParenthesesExpansion(rightString));
    }
    
    static boolean checkCorrectParenthesesExpansion (String string) {
    
        Deque<Character> stack = new ArrayDeque<>();
    
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']')
            if (!stack.isEmpty()) {
                char temp = stack.pop();
                if ((c == ')' && temp != '(') || (c == '}' && temp != '{') || (c == ']' && temp != '[')) {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        return true;
    }
}
