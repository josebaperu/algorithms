package org.josebaperu.leetcode.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String[] strs) {
        int idx = 0;
        boolean found = false;
        for (String str: strs){
            for (char c: str.toCharArray()){

            }
            idx++;
        }
        return strs[0].substring(0,idx);
    }
}
