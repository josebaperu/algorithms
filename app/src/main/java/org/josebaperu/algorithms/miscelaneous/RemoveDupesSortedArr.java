package org.josebaperu.algorithms.miscelaneous;

import java.util.HashMap;
import java.util.Map;

public class RemoveDupesSortedArr {
    public static void main(String[] args) {
        //int[] arr= {0,0,1,1,1,2,2,3,3,4};
        int[] arr= {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i );
                newArr[map.size()-1] = nums[i];
            }
        }
        System.arraycopy(newArr, 0, nums, 0, newArr.length);

        return map.size();
    }
}
