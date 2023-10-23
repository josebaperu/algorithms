package org.josebaperu.algorithms.miscelaneous;

import java.util.HashMap;
import java.util.Map;

public class RemoveDupesSortedArr {
    public static void main(String[] args) {
        int[] arr= {0,0,1,1,1,2,2,3,3,4};
        //int[] arr= {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i );
                nums[map.size()-1] = nums[i];
            }
        }

        return map.size();
    }
}