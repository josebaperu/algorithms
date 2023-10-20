package org.josebaperu.algorithms.miscelaneous;

import java.util.Arrays;
import java.util.List;

public class SumOfTwoNumbs {
    public static void main(String[] args) {
        int[]numbers = {3,3};
        System.out.println(Arrays.toString(sumOfTwo(numbers,6)));
    }

    static int[] sumOfTwo(int[] nums, int target){

        for(int idx = 0; idx < nums.length ; idx++){
            int complement = target - nums[idx];
            int i = Arrays.binarySearch(nums,complement);
            if( i > -1)
                return new int[] {idx,i};

        }

        return new int[0];
    }
    private static int indexOfIntArray(int[] array, int key) {
        int returnvalue = -1;
        for (int i = 0; i < array.length; ++i) {
            if (key == array[i]) {
                returnvalue = i;
                break;
            }
        }
        return returnvalue;
    }
}
