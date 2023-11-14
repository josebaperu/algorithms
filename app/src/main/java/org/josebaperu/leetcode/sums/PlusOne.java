package org.josebaperu.leetcode.sums;

public class PlusOne {
    public static void main(String[] args) {

        plusOne(new int[]{8,8});
        plusOne(new int[]{9,9});
        plusOne(new int[]{8,9,9});
        plusOne(new int[]{9,8,9});
        plusOne(new int[]{1,8,8});


    }

    static int[] plusOne(int[] digits) {

        int idx = digits.length-1;
        while(idx > -1){
            int current = digits[idx];
            if(current < 9){
                digits[idx]++;
                return digits;
            } else {
                digits[idx] = 0;
            }

        idx--;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;

    }
}
