package org.josebaperu.leetcode;
public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    static  int arrangeCoins(int n) {
        int remainder = n;
        int idx = 1;
        while(true){
            remainder = remainder - idx;
            if(remainder <= 0) break;
            idx++;
        }
        return remainder == 0? idx:idx-1;
    }
}
