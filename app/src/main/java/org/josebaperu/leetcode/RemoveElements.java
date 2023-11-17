package org.josebaperu.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveElements {
    public static void main(String[] args) {
        int[]nums = {3,2,2,3};//1
        int[]nums1 = {0,1,2,3,4,5,6,2};//2
        System.out.println(removeElement(nums,3));
        //System.out.println(removeElement(nums1,2));
    }
    static int removeElement(int[] nums, int val) {
        if(nums.length == 0)return 0;
        if(nums.length == 1)return nums[0] == val?0:nums[0];

        Stack<Integer> stack = new Stack<>();
        int last = nums.length-1;

        while( last >= 0){
            if(nums[last] != val){
                stack.push(nums[last]);
            }
            last--;
        }
        int result = stack.size();
        int idx = 0;
        while(!stack.isEmpty()){
            nums[idx] = stack.pop();
            idx++;
        }
        return result;
    }
}
