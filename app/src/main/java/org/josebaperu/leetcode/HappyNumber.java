package org.josebaperu.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(isHappy(n, new HashSet<>()));
    }
    static boolean isHappy(int n, Set<Integer> set){
            List<Integer> list = new ArrayList<>();
            int tmp = n;
            while(tmp !=0){
                int rem = tmp%10;
                list.add(rem);
                tmp = tmp/10;
            }

            int sum = list.stream()
                    .mapToInt(e -> (int) Math.pow(e, 2))
                    .sum();
            boolean isUniqueCycle = set.add(sum);
            if(!isUniqueCycle) return false;


            return sum == 1 ? true : isHappy(sum, set);

    }
}
