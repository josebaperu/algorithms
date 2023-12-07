package org.josebaperu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDupe {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> uniqueMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {

            int current = nums[i];
            if (uniqueMap.containsKey(current)) {
                return true;
            }
            uniqueMap.put(current, i);
        }

        return false;
    }
}
