package org.josebaperu.algorithms.strings;

import org.apache.commons.lang3.Validate;

import java.util.ArrayDeque;
import java.util.Deque;

public class StringBackspace {

    public static void main(String[] args) {
        Validate.isTrue(StringBackspace.isEqual("ab#c","ad#c") );
        Validate.isTrue(isEqual("ab##","c#d#") );
        Validate.isTrue(!isEqual("a#c","b"));
    }

    private static boolean isEqual(String a, String b) {
        String resultA = util(a);
        String resultB = util(b);
        return resultA.equals(resultB);
    }
    private static String util(String str) {
        Deque<Character> dq = new ArrayDeque<>();
        for(Character c : str.toCharArray()){
            if(c.toString().equals("#")){
                if(!dq.isEmpty()){
                    dq.removeLast();
                }
            } else {
                dq.addLast(c);
            }
        }
    return dq.toString();
    }
}
