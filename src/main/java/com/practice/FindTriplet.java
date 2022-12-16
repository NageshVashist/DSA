package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class FindTriplet {
//    Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
//    1,3,4,6,9,12
//    Output: 12, 3, 9
//    Explanation: There is a triplet (12, 3 and 9) present
//    in the array whose sum is 24.

    public static void main(String[] args) {

        Integer arr[]= new Integer[]{12, 3, 4, 1, 6, 9};
        int sum =24;
        Arrays.sort(arr);
        boolean isFound=false;
        for(int i=arr.length-1 ; i>0;i--){

            for(int j =0;j<arr.length-2;j++){

                for(int k =j+1 ;k<arr.length-1;k++ ){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        isFound=true;
                        break;
                    }

                }
                if(isFound){
                    break;
                }

            }

        }
    }
}
