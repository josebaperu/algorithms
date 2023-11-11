package org.josebaperu.leetcode.sums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        System.out.println(Arrays.toString(doSum(arr,target)));
    }
    static int[] doSum(int[] arr, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0 ; i < arr.length;i++){
            int current = arr[i];
            int complement = target - current;

            if(map.containsKey(complement)){
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(arr[i],i);
        }

        return result;
    }
}
