package org.josebaperu.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//|
public class TwoSum {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int target = 9;
            System.out.println(Arrays.toString(doSum(arr, target)));
    }

    static int[] doSum(int[] arr, int target){
        int[] arrResponse = new int[2];
        if(arr == null  || arr.length ==0)
            return arrResponse;

        Map<Integer, Integer> mapOfIdx = new HashMap<>();
        int idx = 0;
        while(idx < arr.length){
            int compl = target - arr[idx];
            if(mapOfIdx.containsKey(compl)){
                arrResponse[0] = idx;
                arrResponse[1] = mapOfIdx.get(compl);
            }
             mapOfIdx.put(arr[idx], idx);
             idx++;
        }

        return arrResponse;
    }
}
