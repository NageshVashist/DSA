package com.leetcode.level_2;

import java.util.Arrays;

public class FindBall {
    public static void main(String[] args) {
        int[][] arr ={{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1},{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1}};
                //{{-1}};
                //{{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
                //{{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        Arrays.stream(new FindBall().findBall(arr)).forEach(System.out::println);
    }
    public int[] findBall(int[][] grid) {

        {
            int arr[] = new int[grid[0].length];
            Arrays.fill(arr, -1);
            int mr = grid.length;
            int mc = grid[0].length;
            int cr = 0, cc = 0, i=0;
            if(arr.length==1){
                arr[0]=-1;
                return arr;
            }
            while (i<mc) {
                cc=i;
                cr=0;
                while (cc < mc && cr<mr) {
                    if (cc+1<mc && grid[cr][cc] == 1 && grid[cr][cc + 1] == 1) {
                        cr++;
                        cc++;
                    }
                    else if(cc>0 && grid[cr][cc] == -1 && grid[cr][cc - 1] == -1){
                        cr++;
                        cc--;
                    }
                    else
                        break;
                }
                if(cr==mr) {
                    arr[i] = cc;
                }
                i++;


            }

            return arr;
        }
    }

}
