package org.josebaperu.leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9,0,9};
        System.out.println(Arrays.toString(doPlusOne(nums)));
    }

    private static int[] doPlusOne(int[] nums) {
        if(nums.length ==0) return new int[0];

        int lastIdx = nums.length-1;
        int lastVal = nums[lastIdx];

        if(lastVal < 9){
            nums[lastIdx] = lastVal+1;
            return nums;
        } else {
            int carry = 1;
            while (lastIdx >= 0) {
                int last = nums[lastIdx];

                if (last + carry == 10) {
                    nums[lastIdx] = 0;
                    carry = 1;
                } else if (carry == 1) {
                    nums[lastIdx] = last + 1;
                    carry = 0;
                }
                lastIdx--;

            }
            if(nums[0] != 0){
                return  nums;
            } else {
                int[] res = new int[nums.length+1];
                res[0] = 1;
                for(int i= 0; i< nums.length;i++){
                    res[i+1] = nums[0];
                    return res;
                }
            }
            return nums;
        }
    }
}
