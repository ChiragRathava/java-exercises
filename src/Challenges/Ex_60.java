package Challenges;

import java.util.Stack;

public class Ex_60 {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){

            // Push opening brackets
            if(ch == '(' || ch == '{' || ch == '['){stack.push(ch);}

            // Check closing brackets
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {stack.pop();}
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {stack.pop();}
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {stack.pop();}
            else {
                // If it doesn't match, return false
                return false;
            }
        }

        // Valid only if stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}
