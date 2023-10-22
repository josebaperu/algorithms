package org.josebaperu.algorithms.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] words = {"flower","flow","fluor"};
        System.out.println(longestCommonPrefix(words));
    }
    static String longestCommonPrefix(String[] strs) {
        StringBuilder  sb = new StringBuilder();
        boolean isProcessing = true;
        final int MAX = strs.length;
        int idx = 0;
        while(isProcessing){
            Map<Character,Integer> indicesMap = new LinkedHashMap<>();
            Character charr = null;
            int forIdx = 1;
            for (String word: strs){
                if(word.isEmpty() || word.length() == idx){
                    isProcessing = false;
                    break;
                }
                charr = word.charAt(idx);
                indicesMap.put(charr, forIdx);
                forIdx++;
            }
            if(indicesMap.size() == 1 && indicesMap.get(charr) == MAX){
                sb.append(charr);
                idx++;
            } else {
                isProcessing = false;
                break;
            }
        }
        return sb.toString();
    }
}
