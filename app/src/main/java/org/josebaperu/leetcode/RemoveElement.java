package org.josebaperu.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveElement {
    public static void main(String[] args) {
        int res = removeElement(new int[]{2,2,3},2);
        System.out.println(res);
    }


    static int removeElement(int[] nums, int val) {
        Queue<Integer> remQueue = new LinkedList<>();
        Stack<Integer> validStack = new Stack<>();
        for(int i = 0; i < nums.length ;i++){
            int current = nums[i];
            if(current == val){
                remQueue.add(i);
            }else{
                validStack.add(i);
            }
        }
        int ret = validStack.size();
        while(!remQueue.isEmpty() && !validStack.isEmpty()){
            int popRem = remQueue.remove();
            int popValid = validStack.pop();
            nums[popRem] = nums[popValid];

        }
        return ret;
    }
}
