package org.josebaperu.algorithms.miscelaneous;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String given = "([]{})";
        System.out.println(isValid(given));
    }
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
                ')','(',
                ']','[',
                '}','{');
        for(char c : s.toCharArray()){
            stack.push(c);
            if(map.containsKey(c)){
                char pop = stack.pop();
                if(!stack.isEmpty() && (map.get(pop)).equals(stack.peek())){
                    stack.pop();
                } else{
                    stack.push(pop);
                }
            }
        }
        return stack.isEmpty();
    }
}
