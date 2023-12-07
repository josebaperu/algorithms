package org.josebaperu.leetcode;

import java.util.*;

public class ArrangeZeroesToEnd {

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,2,1};
        arrangeZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void arrangeZeroes(int[] nums) {
        if(nums.length ==1)return;
        int count = nums.length-1;
        Stack<Integer> stack = new Stack<>();
        while(count >= 0){
            int current = nums[count];
            if(current != 0){
                stack.add(current);
                nums[count] = 0;
            }
            if(count == 0){
                while(!stack.isEmpty()){
                    nums[count] = stack.pop();
                    count++;
                }
                break;
            }
            count --;
        }
    }
}
