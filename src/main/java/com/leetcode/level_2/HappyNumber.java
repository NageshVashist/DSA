package com.leetcode.level_2;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(new HappyNumber().isHappy(19));

    }

    public int getsum(int n){
        int s=0;
        while(n>0){
            int a=n%10;
            n=n/10;
            s+=a*a;
        }
        return s;
    }
    public boolean isHappy(int n) {
        HashSet seen = new HashSet();
        while (n!=1 && !seen.contains(n)) {
            seen.add(n);
            n=getsum(n);
        }

        return n==1;

    }
}
