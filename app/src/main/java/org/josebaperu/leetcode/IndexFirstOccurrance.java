package org.josebaperu.leetcode;

public class IndexFirstOccurrance {

    public static void main(String[] args) {
        String haystack = "carljesuscarloxxxcarlo";
        String word = "carlo";
        System.out.println(doFind(haystack,word));
    }
    static int doFind(String haystack, String word){
        char firstChar = word.charAt(0);
        int lenWord = word.length();
        int i = 0;
        while(i < haystack.length() - lenWord + 1){
            if(haystack.charAt(i) == firstChar){
                int hayIdx = i;
                int wordIdx = 0;
                boolean isEqual = false;
                while(wordIdx < lenWord){
                    if(haystack.charAt(hayIdx) != word.charAt(wordIdx)){
                        isEqual = false;
                        break;
                    } else {
                        isEqual = true;
                    }
                    wordIdx++;
                    hayIdx++;
                }
                if(isEqual){
                    return i;
                }
            }
            i++;
        }

        return -1;
    }
}
