package org.josebaperu.leetcode.strings;

import java.util.Stack;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String[] strs) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        if(strs.length == 0){
            return result;
        }
        if(strs.length == 1){
            return strs[0];
        }
        int idx = 0;
        int idxChar = 0;
        boolean running = true;
        int len = strs.length;

        while (running){

            if(idx == len){
                if(stack.size() == idx){
                    result = result + stack.peek();
                    stack = new Stack<>();
                } else {
                    running = false;
                }
                idxChar++;
                idx = 0;

            }
            String current = strs[idx];
            if(current.length() == 0){
                return "";
            }
            if(current.length() > idxChar){
                Character c = current.charAt(idxChar);
                if(idx == len){
                    idx = 0;
                    idxChar++;
                }
                if(idx == 0){
                    stack.push(c);
                } else if (stack.peek().equals(c)){
                    stack.push(c);
                }
                idx++;
            } else {
                running = false;
            }

        }
        return result;
    }
}
