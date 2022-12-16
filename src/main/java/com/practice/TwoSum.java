package com.practice;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] ans = new int[2];
        int[] nums = {2, 5, 5, 11};
        HashMap map = new HashMap();
        int target = 13;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                ans[0]= (int) map.get(target-nums[i]);
                ans[1]=i;
                System.out.println(ans[0]+":"+ans[1]);
                return;
            }
            map.put(nums[i],i);
        }

    }
}
