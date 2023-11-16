package org.josebaperu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDupesSortedArr {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(doRemove(nums));

    }

    private static int doRemove(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return 1;
        Map<Integer,Integer> mapValIdx = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int current = nums[i];
            if(!mapValIdx.containsKey(current)){
                nums[mapValIdx.size()] = current;
                mapValIdx.put(current, i);
            }
        }
        return mapValIdx.size();
    }
}
