package org.josebaperu.leetcode;

import java.util.Arrays;

public class FindDupes {

    public static void main(String[] args) {
        int[] arr = {9,6,7,7,8};
        doFindDupes(arr);
    }

    static boolean doFindDupes(int[] arr) {
        Arrays.sort(arr);

        for(int i=1; i < arr.length;i++){
            int prev = arr[i-1];
            int next = arr[i];
            if(prev == next) return true;
        }
        return false;
    }
}
