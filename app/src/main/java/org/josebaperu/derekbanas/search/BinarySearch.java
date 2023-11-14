package org.josebaperu.derekbanas.search;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,8,9,10};
        int index = doSearch(arr, 1);
        System.out.println(index);
    }

    static int doSearch(int[] arr, int num) {

        int len = arr.length;
        int min = 0;
        int max = len-1;
        int idx = -1;

        while(min <= max){
            int mid = min + (max-min)/2;

            if(arr[mid]== num){
                idx = mid;
                break;
            }

            if(arr[mid] > num){
                max = mid-1;
            }else{
                min = mid+1;
            }

        }
        return idx;

    }

}
