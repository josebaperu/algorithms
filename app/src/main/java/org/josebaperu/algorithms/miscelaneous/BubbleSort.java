package org.josebaperu.algorithms.miscelaneous;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,4,8,7,9};
        System.out.println(Arrays.toString(doSort(arr)));
    }

    static int[] doSort(int[] arr){
        for(int i=0; i < arr.length -1 ; ++i){
            for(int j=0; j < arr.length -i -1 ; ++j){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
