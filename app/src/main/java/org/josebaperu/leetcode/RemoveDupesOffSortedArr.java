package org.josebaperu.leetcode;

public class RemoveDupesOffSortedArr {
    public static void main(String[] args) {
        int[]nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDupes(nums);
        System.out.println(result);
    }
    static int removeDupes(int[] nums){
        int idx = 0;
        int lastNum = -Integer.MAX_VALUE;
        for(int i = 0; i< nums.length;i++){
            int current = nums[i];
            if(current != lastNum){
                nums[idx] = current;
                idx++;
                lastNum = current;
            }
        }
        return idx;
    }
}
