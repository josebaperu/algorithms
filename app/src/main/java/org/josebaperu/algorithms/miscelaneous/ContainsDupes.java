package org.josebaperu.algorithms.miscelaneous;

import java.util.HashMap;
import java.util.Map;

public class ContainsDupes {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,1};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
            boolean hasDupes = false;
            for (int n: nums){
                if(map.containsKey(n)){
                    hasDupes = true;
                    break;
                } else {
                    map.put(n,n);
                }
            }

            return hasDupes;
    }
}
