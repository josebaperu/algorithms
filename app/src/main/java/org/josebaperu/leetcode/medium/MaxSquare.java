package org.josebaperu.leetcode.medium;

public class MaxSquare {
    public static void main(String[] args) {

        char[][] mt = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(maxSquare(mt));
    }

    static int maxSquare(char[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(cols ==0 || rows == 0) return 0;

        int count = 0;
        int max = 0;
        int[]dp = new int[rows*cols];

        for(int i=0; i< rows; i++){
            for(int j=0; j< cols; j++){
                if(i==0 ||j==0){
                    dp[count] = matrix[i][j] - '0';
                    count++;
                } else if(matrix[i][j] == '0'){
                    dp[count] = Math.min(Math.min(dp[count-1],dp[count-cols]), dp[count-cols-1]) +1;
                    count++;
                }
                max = Math.max(max, dp[count-1]);
            }
        }
        return max * max;
    }
}
