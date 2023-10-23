package org.josebaperu.algorithms.miscelaneous;

public class RemoveNumbOfArr {
    public static void main(String[] args) {
        int[] arr= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(doRemove(arr , 1));
    }
    static int doRemove(int[] nums, int n) {
        int counter = 0;
        for(int i = 0; i < nums.length ; i++){
            int numByIdx = nums[i];
            if(numByIdx == n){
                counter++;
            } else {
                int tempIdx = i-counter;
                nums[tempIdx] = numByIdx;
            }
        }
        return nums.length - counter;
    }
}
