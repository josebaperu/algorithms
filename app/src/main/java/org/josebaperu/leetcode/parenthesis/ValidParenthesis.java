package org.josebaperu.leetcode.parenthesis;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(])";
        System.out.println(isValid(str));
    }

    static boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.size() >0){
                char peek = stack.peek();
                if(c == ')' && peek == '('){
                    stack.pop();
                } else if(c == '}' && peek == '{'){
                    stack.pop();
                } else if(c == ']' && peek == '['){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
    return stack.size() == 0;
    }
}
