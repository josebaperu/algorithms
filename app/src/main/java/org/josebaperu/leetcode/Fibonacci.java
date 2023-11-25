package org.josebaperu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        System.out.println(fib(20, map));
    }
    static int fib(int n, Map<Integer,Integer>map){
        if(n < 2)return n;
        if(!map.containsKey(n)){
            map.put(n,fib(n-2, map) + fib(n-1,map));
        }
        return map.get(n);
    }
}
