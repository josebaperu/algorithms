package org.josebaperu.algorithms.sort;

import java.util.Arrays;

public class MinSwaps {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        System.out.println(doSwap(arr));
    }
    static int doSwap(int [] array){

        int idx = 0;
        int counter = 0;
        while(idx < array.length){
            int value = array[idx];
            if(value != idx +1){
                int tmp = value;
                array[idx] = array[value-1];
                array[value-1] = tmp;
                counter++;
            } else{
                idx++;
            }
        }
        System.out.println(Arrays.toString(array));
        return counter;
    }
}
