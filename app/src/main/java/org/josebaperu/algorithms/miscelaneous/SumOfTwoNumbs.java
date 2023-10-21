package org.josebaperu.algorithms.miscelaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class SumOfTwoNumbs {
    public static void main(String[] args) {
        int[]numbers = {2,7,11,15};
        System.out.println(Arrays.toString(sumOfTwo(numbers,9)));
    }

    static int[] sumOfTwo(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int idx = 0; idx < nums.length ; idx++){
            int current = nums[idx];
            int complement = target - current;
            if(map.containsKey(current))
                return new int[] {map.get(current),idx};
            map.put(complement, idx);
        }
        return new int[0];
    }

}
