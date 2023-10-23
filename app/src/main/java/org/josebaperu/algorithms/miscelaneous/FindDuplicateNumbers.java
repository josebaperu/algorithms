package org.josebaperu.algorithms.miscelaneous;

import java.util.Arrays;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int [] arr = {0};
        System.out.println(doFind(arr));
    }

    static boolean doFind(int[] arr){
        boolean hasDupes = false;

        for(int i=0; i < arr.length -1 ; ++i){
            if(hasDupes){
                break;
            }
            for(int j=0; j < arr.length -i -1 ; ++j){
                if(arr[j] == arr[j+1]){
                    hasDupes = true;
                    break;
                }
            }
        }
        return hasDupes;
    }
}
