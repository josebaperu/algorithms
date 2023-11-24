package org.josebaperu.leetcode;

public class PalindromeNumb {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12343210));
    }
    static boolean isPalindrome(int x) {
        int tmp = x;
        StringBuilder sb = new StringBuilder();
        while(tmp != 0){
            int numDigit = tmp%10;
            sb.append(numDigit);
            tmp = tmp/10;
        }
        Long val = Long.parseLong(sb.toString());
        return x - val == 0;
    }
}
