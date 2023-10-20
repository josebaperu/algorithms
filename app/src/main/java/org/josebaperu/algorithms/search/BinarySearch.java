package org.josebaperu.algorithms.search;

import java.util.Arrays;

public class BinarySearch {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 2;
        System.out.println("index of "+n+" in arr is : " + doBinarySearch(arr,n,0));
    }
    

    public static boolean doBinarySearch(int[]arrToSearch, int number, int index ){
        int length = arrToSearch.length;
        if(length ==0 || arrToSearch[0] > number || arrToSearch[length-1] < number) {
            return false;
        }
        int half = (length/2);
        int middleNumber = arrToSearch[half];
        if ( middleNumber == number)
            return true;

        boolean numberInFirstHalf = middleNumber > number;
        int [] newArray = numberInFirstHalf ? Arrays.copyOfRange(arrToSearch,0,half) : Arrays.copyOfRange(arrToSearch,half,length);
        return doBinarySearch(newArray, number ,index );
    }
}