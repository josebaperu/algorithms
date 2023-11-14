package org.josebaperu.derekbanas.search;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[]arr = {9,8,7,6,3};
        System.out.println(Arrays.toString(doSelectionSort(arr)));
    }
    static int[] doSelectionSort(int[] arr){
        for(int i =0; i < arr.length-1 ;i++){
            int idx = i;
            for(int d = i+1; d < arr.length ;d++){
                if(arr[d] < arr[i]){
                    idx = d;
                }
            }
                int tmp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = tmp;

        }
        return arr;
    }

}
