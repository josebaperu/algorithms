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
            int i = lastIndexOf(nums,complement);
            if( i > -1)
                return new int[] {idx,i};

        }

        return new int[0];
    }
    private static int lastIndexOf(int[] array, int key) {
        int returnvalue = -1;
        for (int i = array.length -1; i >=0 ; --i) {
            if (key == array[i]) {
                returnvalue = i;
                break;
            }
        }
        return returnvalue;
    }
}
