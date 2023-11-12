package org.josebaperu.leetcode.dupes;

public class RemoveELement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr,3));
    }
    static int removeElement(int[] nums, int target) {
        int count = 0;
        for(int j = 0; j < nums.length;j++){
            int current = nums[j];
            if(current == target){
                count++;
            } else if(current != target){
                nums[j-count] = nums[j];
            }
        }
        return nums.length - count;
    }
}
