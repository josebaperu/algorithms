package org.josebaperu.algorithms.miscelaneous;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDupesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println("k " + k);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] == expectedNums[i]);
        }
    }
    static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
