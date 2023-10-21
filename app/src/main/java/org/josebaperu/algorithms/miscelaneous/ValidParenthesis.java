package org.josebaperu.algorithms.miscelaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String given = "([]{})";
        System.out.println(isValid(given));
    }
    static boolean isValid(String s) {
        List<String> list = Arrays.asList(s.split(""));
        Stack<String> stack = new Stack<>();
        Map<String, String> map = Map.of(
                ")","(",
                "]","[",
                "}","{");
        for(String str: list){
                stack.push(str);
                if(map.containsKey(str)){
                    String pop = stack.pop();
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
