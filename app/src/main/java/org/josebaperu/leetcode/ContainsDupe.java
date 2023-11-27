package org.josebaperu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDupe {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            if(!map.containsKey(n)){
                map.put(n,n);
            }else{
                return true;
            }
        }
        return false;
    }
}
