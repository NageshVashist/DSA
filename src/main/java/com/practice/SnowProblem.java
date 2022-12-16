package com.practice;


//             ___                |   |        ___
//            |   |        ___    |   |___    |   |
//         ___|   |    ___|   |   |   |   |   |   |
//         ___|___|___|___|___|___|___|___|___|___|___|___
//         {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
//                                 ___
//             ___                |   |        ___
//            |   | *   *  _*_  * |   |_*_  * |   |
//         ___|   | *  _*_|   | * |   |   | * |   |
//         ___|___|___|_*_|___|___|_*_|___|___|_*_|___|___
//         {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}

public class SnowProblem {
    public static void main(String[] args) {
        int [] arr=new int[]{0,1,3,0,1,2,0,4,2,0,3,0};
        System.out.println(twoPointer(arr));
    }
    public static int twoPointer(int []arr){
        int maxSnow=0;
        int left[]= new int[arr.length];
        int right[]= new int[arr.length];

        //                               0,1,3,0,1,2,0,4,2,0,3,0
        //get max height from left side  0,1,3,3,3,3,3,4,4,4,4,4
        //get max height from right side 4,4,4,4,4,4,4,4,3,3,3,0

        //        min(left,right)-arr[i] 0,0,0,3,2,1,3,0,1,3,0,0

        for(int i=1;i<arr.length-1;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }

        for(int i=0;i< arr.length-1;i++){
            maxSnow=maxSnow+Math.min(left[i],right[i])-arr[i];

        }
        return maxSnow;
    }
}
