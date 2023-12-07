package org.josebaperu.leetcode.medium.grids;


public class NumOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','0','0'},
                {'1','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(getNumOfIslands(grid));

    }
    static int getNumOfIslands(char[][] grid){
        int count = 0;
        for(int i =0; i< grid.length;i++){
            for(int j = 0; j< grid[0].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    doBFS(i,j,grid);
                }
            }
        }

        return count;
    }

    static void doBFS(int i, int j, char[][] grid){
        if(i <0 || i>= grid.length || j<0 || j>= grid[i].length || grid[i][j]=='0') return ;
        grid[i][j] = '0';
        doBFS(i-1,j,grid);
        doBFS(i+1,j,grid);
        doBFS(i,j-1,grid);
        doBFS(i,j+1,grid);
    }
}
