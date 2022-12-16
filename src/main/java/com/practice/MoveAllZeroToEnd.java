package com.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[]={4,5,0,3,0,2,0,0,1};
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[j++]= arr[i];
            }
        }
        for (;j< arr.length;j++){
            arr[j]=0;
        }

        Arrays.stream(arr).forEach(i-> System.out.println(i));
    }
}
