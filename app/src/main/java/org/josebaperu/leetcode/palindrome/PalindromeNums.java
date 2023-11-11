package org.josebaperu.leetcode.palindrome;

public class PalindromeNums {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12364321));;
    }
    static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int tempNumb = x;
        long result = 0;
        while(tempNumb > 0) {
            int length = String.valueOf(tempNumb).length()-1;

            int tmpMinusLastDigit = tempNumb/10;
            int lastDigit = tempNumb - tmpMinusLastDigit * 10;
            double reversedSum  = lastDigit * Math.pow(10, length);
            result = result + Double.valueOf(reversedSum).longValue();
            tempNumb = tmpMinusLastDigit;
        }
        return x == result;

    }
}
