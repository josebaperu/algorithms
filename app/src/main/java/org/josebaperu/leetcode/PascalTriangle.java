package org.josebaperu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> triangle = generateTriangle(6);
        System.out.println(triangle);
    }

    static List<List<Integer>> generateTriangle(int rows){
        List<List<Integer>> triangle = new ArrayList<>();
        if(rows == 0) return triangle;
        triangle.add(List.of(1));

        for(int i= 1; i< rows;i++){
            List<Integer> prevSubList = triangle.get(i-1);
            List<Integer> currentSubList = new ArrayList<>();
            currentSubList.add(1);

            for(int j= 1; j < i;j++){
                currentSubList.add(prevSubList.get(j-1) + prevSubList.get(j));
            }
            currentSubList.add(1);
            triangle.add(currentSubList);
        }
        return triangle;
    }
}
