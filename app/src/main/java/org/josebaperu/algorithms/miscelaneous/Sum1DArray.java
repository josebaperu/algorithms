package org.josebaperu.algorithms.miscelaneous;

import java.util.Arrays;

public class Sum1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];
            int accumulator = 0;
            for(int i=0;i < nums.length;i++){
                accumulator = accumulator + nums[i];
                result[i] = accumulator;
            }
            return result;
    }
}
