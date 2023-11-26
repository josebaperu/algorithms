package org.josebaperu.leetcode;

public class PalindromeStr {

    public static void main(String[] args) {
        System.out.println(isPalindrome("1234321"));
    }
    static boolean isPalindrome(String x) {
        int low = 0;
        int high = x.length() -1;
        boolean isPalindrome = true;
        while(low< high){
            if(x.charAt(low) != x.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        return isPalindrome;
    }
}
