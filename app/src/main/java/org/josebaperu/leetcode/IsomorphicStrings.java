package org.josebaperu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egh";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String a, String b){
        boolean response = false;
        if(a == null || b == null) return response;
        if(a.length() != b.length()) return response;

        Map<Character,Integer> mapLeft = new HashMap<>();
        Map<Character,Integer> mapRight = new HashMap<>();
        for(int i = 0; i< a.length();i++){
            char left = a.charAt(i);
            char right = b.charAt(i);
            if(!mapLeft.containsKey(left) && !mapRight.containsKey(right)){
                mapLeft.put(left,i);
                mapRight.put(right,i);
                response = true;
            } else {
                Integer expLeftIdx = mapLeft.get(left);
                Integer expRightIdx = mapRight.get(right);
                if(expRightIdx != expLeftIdx){
                    return false;
                }
            }
        }

        return response;
    }

}
