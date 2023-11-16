package org.josebaperu.leetcode;

public class IsPalindromeNum {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 9) return true;
        String numStr = String.valueOf(x);
        int low = 0;
        int high = numStr.length()-1;
        boolean isP = true;
        while(low < high){
            if(numStr.charAt(low) != numStr.charAt(high)) return false;
            low++;
            high--;
        }
        return isP;
    }
}
