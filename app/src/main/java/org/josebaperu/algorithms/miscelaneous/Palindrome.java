package org.josebaperu.algorithms.miscelaneous;

public class Palindrome {

    public static void main(String[] args) {
        int numb = 125621;
        System.out.println(isPalindrome(numb));
    }

    private static boolean isPalindrome(int numb) {
        if(numb < 0){
            return false;
        }
        if(numb < 10){
            return true;
        }
        String string = String.valueOf(numb);
        StringBuilder sb = new StringBuilder(string);
        String reverse = sb.reverse().toString();

        return reverse.equals(string);
    }
}
