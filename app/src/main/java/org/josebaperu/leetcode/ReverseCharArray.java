package org.josebaperu.leetcode;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[]arr = new char[] {'a','b','c','d','e'};
        doReverse(arr);
    }
    static void doReverse(char[] arr){
        if(arr.length > 1){
            int low = 0;
            int high = arr.length-1;
            while(low < high){
                char tmpLow = arr[low];
                char tmpHigh = arr[high];
                arr[low] = tmpHigh;
                arr[high] = tmpLow;
                low++;
                high--;
            }
        }
    }
}
