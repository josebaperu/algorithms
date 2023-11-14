package org.josebaperu.derekbanas.search;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13,12,4,15,6};
        System.out.println(Arrays.toString(arr));

        doInsertSort(arr);
    }
    static int[] doInsertSort(int[]arr){
        for(int i = 0; i < arr.length-1;i++){

            if(arr[i] > arr[i+1]){
                int tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= tmp;
                System.out.println(Arrays.toString(arr));

                int idx = 0;
                while(idx < i){
                    if(arr[idx] > arr[i]){
                        int t = arr[idx];
                        arr[idx] = arr[i];
                        arr[i] = t;
                        System.out.println(Arrays.toString(arr));
                    }
                    idx++;
                }
            }
        }

        return arr;
    }
}
