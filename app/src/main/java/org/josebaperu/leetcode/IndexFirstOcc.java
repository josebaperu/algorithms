package org.josebaperu.leetcode;

public class IndexFirstOcc {
    public static void main(String[] args) {
        String hay = "abc";
        String need = "c";
        System.out.println(strStr(hay,need));
    }
    static int strStr(String longString, String word) {
        if(word.length()> longString.length()) return -1;
        if(word.length() == 1 && longString.length() ==1) return word.equals(longString)? 0:-1;

        int idx = 0;
        while(true){
            if(idx+word.length() > longString.length()) return -1;
            String sub = longString.substring(idx,word.length()+idx);
            if(sub.equals(word)){
                return idx;
            } else{
                idx++;
                if(idx > longString.length()-1){
                    return -1;
                }
            }
        }
    }
}
