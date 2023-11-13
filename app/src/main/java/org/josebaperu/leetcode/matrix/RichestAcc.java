package org.josebaperu.leetcode.matrix;

public class RichestAcc {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{5,2,1},{6,2,1}};
        System.out.println(result(arr));
    }

    static int result(int[][] arr){
        int max = 0;
        for(int i = 0; i < arr.length;i++){
            int acc = 0;
            for(int ii = 0; ii < arr[i].length;ii++){
                acc = acc + arr[i][ii];
            }
            max = Math.max(acc,max);
        }
        return max;
    }

}
