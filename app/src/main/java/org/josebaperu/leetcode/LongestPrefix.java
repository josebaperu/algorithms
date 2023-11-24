package org.josebaperu.leetcode;

public class LongestPrefix {
    public static void main(String[] args) {
        System.out.println(findLongest(new String[]{"flower","flower"}));
    }
    static String findLongest(String[] strs){
        if(strs == null) return null;
        String prefixStr = "";

        if(strs.length == 1) return strs[0];

        int charIdx = 0;
        int wordIdx = 0;
        int len = strs.length;;
        while(true){
            String word = strs[wordIdx];
            if(word.length() == charIdx){

                return prefixStr.substring(0,charIdx);
            }
            char ch = word.charAt(charIdx);
            if(wordIdx == 0){
                prefixStr = prefixStr + ch;
            } else {
                if(prefixStr.charAt(charIdx) != word.charAt(charIdx)){
                    return prefixStr.substring(0,charIdx);
                }
            }

            wordIdx++;
            if(wordIdx == len){
                wordIdx = 0;
                charIdx++;
            }

        }
    }
}
