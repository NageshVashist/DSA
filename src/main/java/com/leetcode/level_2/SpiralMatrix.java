package com.leetcode.level_2;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        new SpiralMatrix().spiralOrder(matrix).stream().forEach(System.out::println);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        int maxr = matrix.length;
        int maxc = matrix[0].length;
        int tc=maxr*maxc;
        int minr=0;
        int minc=0;
        int c=0;
        int start=0;
        List<Integer> list = new ArrayList<>();
        while(c<tc){
            while(minc<maxc && c<tc) {
                list.add(matrix[minr][minc]);
                minc++;
                c++;
            }
            minr++;
            minc--;
            while(minr<maxr && c<tc) {
                list.add(matrix[minr][minc]);
                minr++;
                c++;
            }
            minc--;
            minr--;
            while(minc>=start && c<tc) {
                list.add(matrix[minr][minc]);
                minc--;
                c++;
            }
            minc++;
            minr--;
            while(minr>=start+1 && c<tc) {
                list.add(matrix[minr][minc]);
                minr--;
                c++;
            }

            maxc-=1;maxr-=1;
            start++;
            minc=minr=start;

        }




        return list;

    }
}
