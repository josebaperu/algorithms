package org.josebaperu.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str ="(){}}{";
        String str2 = "{}[]";
        System.out.println(doCheck(str2));
    }

    private static boolean doCheck(String str) {
        if(str == null ||  str.length()%2 != 0) return false;

        char[] chars = str.toCharArray();
        int i =0;
        Stack<Character> stack = new Stack<>();
        while(i < chars.length){
            char current = chars[i];

            if(stack.isEmpty()){
                stack.push(current);
            } else{
                char peek = stack.peek();
                if (current == ']' && peek == '['){
                    stack.pop();
                } else if (current == ')' && peek == '('){
                    stack.pop();
                } else if (current == '}' && peek == '{'){
                    stack.pop();
                } else {
                    stack.push(current);
                }
            }
            i++;

        }
        return stack.isEmpty();
    }
}
