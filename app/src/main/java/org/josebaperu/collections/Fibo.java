package org.josebaperu.collections;

import java.util.HashMap;
import java.util.Map;

public class Fibo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int num = 7;
        doFib(num, map);
        String resp = "false";
        for(Integer n: map.values()){
            if( n == num){
                resp = "true";
                break;
            }
        }
        System.out.println(resp);
    }


    static int doFib(int n, Map<Integer, Integer> map){
        if(n==1 || n==0) return n;

        if(map.containsKey(n)){
            return map.get(n);
        }
        int result = doFib(n-1,map) + doFib(n-2,map);

        map.put(n, result);
        return result;
    }
}
