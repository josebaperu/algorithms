package org.josebaperu.algorithms.strings;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(doReverse("abcdefg"));
    }
    static String doReverse(String str){
        int len = str.length();
        char[] reverse = new char[str.length()];
        int counter = len -1;
        for(char c: str.toCharArray()){
            reverse[counter] = c;
            counter--;
        }
        return String.valueOf(reverse);
    }
}
