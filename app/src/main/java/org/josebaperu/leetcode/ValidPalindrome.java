package org.josebaperu.leetcode;


public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPal(s));
    }

    private static boolean validPal(String s) {
        String str = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        char[] charArr = str.toCharArray();
        int max = charArr.length-1;
        int low = 0;
        while(low<= max){
            if(charArr[low] != charArr[max]){
                return false;
            }
            low++;
            max--;
        }

        return true;
    }
}
