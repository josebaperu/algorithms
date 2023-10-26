package org.josebaperu.algorithms.search;

import java.util.Arrays;

public class FindOcurrance {

    public static void main(String[] args) {
        String stack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(stack,needle ));
    }
    static int strStr(String haystack, String needle) {
        return helper(haystack.toCharArray(), needle,0);
    }

    static int helper(char[] hayStack, String needle, int idx){
        if(hayStack.length == 0){
            return -1;
        }
        if(hayStack[0] == needle.charAt(0)){
            if(hayStack.length >= needle.length()){
                int innerCounter = 0;
                for(char c : hayStack){
                    if(c == needle.charAt(innerCounter)){
                        if(innerCounter == needle.length()-1){
                            return idx;
                        }
                    } else {
                        break;
                    }
                    innerCounter++;
                }
            }
        }

        return helper(Arrays.copyOfRange(hayStack,1, hayStack.length), needle,  ++idx);
    }

}
