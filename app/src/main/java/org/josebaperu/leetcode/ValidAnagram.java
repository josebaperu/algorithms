package org.josebaperu.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(isValidAnagram(str1, str2));
    }

    static boolean isValidAnagram(String s, String t){
        if(s.length() != t.length()) return  false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.compare(sArr, tArr) == 0;
    }
}
