package org.josebaperu.leetcode;


import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String a = "baxx"; String b = "xyby";
        System.out.println(doCheckIsomorphic(a,b));
    }

    private static boolean doCheckIsomorphic(String a, String b) {
        if(a== null || b == null)return  false;
        if(a.length() != b.length()) return  false;
        if(a.length() == 1) return  true;
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for(int i = 0; i <a.length();i++){
            char charA = a.charAt(i);
            char charB = b.charAt(i);

            if (!mapA.containsKey(charA)) {
                mapA.put(charA,i);
            }
            if (!mapB.containsKey(charB)) {
                mapB.put(charB,i);
            }

            if(!mapB.get(b.charAt(i)).equals(mapA.get(a.charAt(i)))){
                return false;
            }
        }

        return true;

    }
}
