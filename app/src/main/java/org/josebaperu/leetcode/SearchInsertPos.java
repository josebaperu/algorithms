package org.josebaperu.leetcode;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[]nums = {1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
    static int searchInsert(int[] nums, int target) {
        if(nums == null) return -1;
        if(nums.length == 1){
            if(target > nums[0]){
                return 1;
            } else {
                return 0;
            }
        }
        int idx = 1;
        while(idx < nums.length){
            int prev = nums[idx-1];
            int next = nums[idx];
            if(idx == nums.length-1 && target > next){
                return idx+1;
            }
            if(idx -1 == 0 && target < prev){
                return 0;
            }
            if( prev < target && target < next){
                return idx;
            } else if(prev == target){
                return idx-1;
            } else if(next == target){
                return idx;
            }
            idx++;
        }
        return-1;
    }
}
