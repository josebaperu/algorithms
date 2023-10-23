package org.josebaperu.algorithms.strings;

import java.util.Stack;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String ss ="luffy is still joyboy";
        System.out.println(doReturn(s));

    }
    static int doReturn(String s) {
        char[] charArr = s.toCharArray();
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char EMPTY = 32;
        char last = EMPTY;
        int counter = 0;
        for(char c: charArr){
            if(c == EMPTY && sb.isEmpty()){
                last = c;
            }
            if(c != EMPTY){
                sb.append(c);
                if(charArr.length -1 == counter){
                    stack.push(sb.toString());
                }
                last = c;
            }
            if(last != EMPTY && !sb.isEmpty() && c == EMPTY){
                last = EMPTY;
                stack.push(sb.toString());
                sb = new StringBuilder();
            }
            counter++;

        }
        return stack.pop().length();
    }
}
