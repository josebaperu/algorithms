package org.josebaperu.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4, 5, 6, 7, 8}, 13)));
    }
    static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) return new int[]{};
        int[] response = new int[2];
        Map<Integer,Integer> mapValAndIdx = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int compl = target -current;
            if(mapValAndIdx.containsKey(compl)){
                response[0] = i;
                response[1] = mapValAndIdx.get(compl);

                return response;
            }
            mapValAndIdx.put(nums[i],i);

        }

        return response;
    }
}
