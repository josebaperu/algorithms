package org.josebaperu.leetcode.matrix;

public class SubMatrix {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        largestLocal(grid);
    }

    static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int res[][] = new int[n-2][n-2];
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                res[i][j] = findMax(grid, i, j);
            }
        }
        return res;
    }
    static int findMax(int[][] grid, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int a = i; a < i+3; a++) {
            for (int b = j; b < j+3; b++) {
                max = Math.max(grid[a][b], max);
            }
        }
        return max;
    }
}
/*
    int n = grid.length;
    int[][] ret = new int[n-2][n-2];
        for(int a = 0; a < n-2; a++){
        int[] first = grid[a];
        int[] second = grid[a+1];
        int[] third = grid[a+2];
        for(int b = 0; b < n-2; b++){
        int max = 0;
        for(int c  = b; c < b+3; c++){
        max = Math.max(max, first[c]);
        }
        for(int d = b; d < b+3; d++){
        max = Math.max(max, second[d]);
        }
        for(int e = b; e < b+3; e++){
        max = Math.max(max, third[e]);
        }
        ret[a][b] = max;
        }
        }
        return ret;*/
