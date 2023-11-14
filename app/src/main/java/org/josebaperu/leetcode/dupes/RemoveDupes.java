package org.josebaperu.leetcode.dupes;

public class RemoveDupes {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        for(j = 1; j < nums.length;j++){
            int left = nums[j-1];
            int right = nums[j];
            if(right > left){
                nums[i] = right;
                i++;
            }

        }
        return i;
    }
}
