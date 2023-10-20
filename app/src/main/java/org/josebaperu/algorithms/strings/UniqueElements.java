package org.josebaperu.algorithms.strings;
import org.apache.commons.lang3.Validate;
public class UniqueElements {
    public static void main(String[] args) {
        Validate.isTrue(isUnique("abcdefg") == -1);
        Validate.isTrue(isUnique("abcdefgf") == 7);
    }
    static int isUnique(String word) {
        String traversedChars ="";
        for(int idx=0; idx < word.length();idx++){
            char currentChar = word.charAt(idx);
            if(traversedChars.indexOf(currentChar) > 0){
                return idx;
            } else {
                traversedChars = traversedChars + currentChar;
            }
        }
        return -1;

    }
}
