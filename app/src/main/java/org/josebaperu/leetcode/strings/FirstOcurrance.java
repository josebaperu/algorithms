package org.josebaperu.leetcode.strings;

public class FirstOcurrance {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        System.out.println(doFind(arr,2));//1
        System.out.println(doFind(arr,5));//4
        System.out.println(doFind(arr,7));//5
        System.out.println(doFind(arr,0));//5
    }
    static int doFind(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        if(arr.length == 1) {
            if(target == arr[0] || target < arr[0]){
                return 0;
            } else {
                return 1;
            }
        }
        int i = -1;
        int idx = 1;
        while(idx < arr.length && arr.length > 1){
            int left = arr[idx-1];
            int right = arr[idx];
            if(left > target && idx == 1){
                i = idx -1;
                break;
            }
            if(left == target){
                i = idx -1;
                break;
            }
            if(right == target){
                i = idx;
                break;
            }
            if(left <  target && target < right){
                i = idx;
                break;
            }
            if( target > right && idx == arr.length -1){
                i = idx + 1;
                break;
            }
            idx++;
        }
        return i;
    }

}
