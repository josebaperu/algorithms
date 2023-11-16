package org.josebaperu.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveElements {
    public static void main(String[] args) {
        int[]nums = {0,1,2,3,4,5,5,6};
        System.out.println(removeElement(nums,5));
    }
    static int removeElement(int[] nums, int val) {
        if(nums.length == 0)return 0;
        if(nums.length == 1)return 0;
        Map<Integer,Integer> mapValsIdx = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            int current = nums[i];
            if(current == val){

            }
        }
        return 0;
    }
}
