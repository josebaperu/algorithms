package org.josebaperu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "aabbbb";
        String str2 = "aaaabb";
        System.out.println(isValidAnagram(str1, str2));
    }

    static boolean isValidAnagram(String s, String t){
        if(s.length() != t.length()) return  false;
        Map<Character,Integer> map =  new HashMap<>();
        for(char c: s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            } else {
                int val = map.get(c)+1;
                map.put(c,val);
            }
        }
        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                int val = map.get(c)-1;
                if(val == 0){
                    map.remove(c);
                } else {
                    map.put(c,val);
                }
            }
        }

        return map.isEmpty();
    }
}
