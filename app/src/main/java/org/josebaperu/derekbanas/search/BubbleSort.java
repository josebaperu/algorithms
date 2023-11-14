package org.josebaperu.derekbanas.search;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,6,0,5,4,0,3,2};
        System.out.println(Arrays.toString(doBubbleSort(arr)));

    }
    static int[] doBubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1;i++){
             for(int ii= i+1; ii < arr.length;ii++){
                 if (arr[i] > arr[ii]) {
                     int tmp = arr[ii];
                     arr[ii] = arr[i];
                     arr[i] = tmp;
                 }
             }
        }
        return arr;
    }
}
