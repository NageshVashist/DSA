package com.leetcode.level_1;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] nums) {
        if(nums.length>1){
            for(int i=1;i<nums.length;i++){
                nums[i]=nums[i]+nums[i-1];
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
