package org.josebaperu.leetcode;


public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{0,1,3}));
    }

    static int findUnique(int[] nums){
        int len = nums.length;
        int sumExact = len*(0 + len-1)/2;
        int sumMissing = (len+1)*(0 + len)/2;

        int i = 0;
        while(i < nums.length){
            int current = nums[i];
            sumExact = sumExact - current;
            sumMissing= sumMissing -current;
            i++;
        }
        return sumExact == 0? nums.length : sumMissing;

    }

}
