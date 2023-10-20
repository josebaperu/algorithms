package org.josebaperu.algorithms.strings;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] words = new String[]  {"roca","pepe","jeep","peep","caro"};
        System.out.println(resolveAnagram(words));
    }
    static Collection<List<String>> resolveAnagram(String[] words){
        Map<String, List<String>> map = new HashMap<>();

        for(String word : words){
            String sortedStr = sortedString(word);
            if(!map.containsKey(sortedStr)) {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sortedStr,list);
            } else{
                map.get(sortedStr).add(word);
            }
        }
        return map.values();

    }
    private static String sortedString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
