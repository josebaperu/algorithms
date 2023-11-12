package org.josebaperu.leetcode.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {

        //System.out.println(lengthOfLastWord(".  hello   world "));
        System.out.println(lengthOfLastWord("hello   world"));
    }
    static int lengthOfLastWord(String word){
        int z = word.length()- 1;
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        while(z > -1){
            char current = word.charAt(z);

            if(word.charAt(z) != ' ' && found){
                sb.append(current);
            }
            if(word.charAt(z) == ' ' && found){
                break;
            }
            if(word.charAt(z) != ' ' && !found){
                sb.append(current);
                found = true;
            }
            z--;
        }
        return sb.length();
    }
}
