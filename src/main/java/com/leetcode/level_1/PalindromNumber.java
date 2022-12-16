package com.leetcode.level_1;

public class PalindromNumber {
    public static void main(String[] args) {
        System.out.println( isPalindrom(11));
    }
    public static boolean isPalindrom(int x){
        if(x>0){
            int y=0;
            int t=x;
            while(t/10>0){
                y=(y+t%10)*10;
                t=t/10;
            }
            y=y+t;

            return y==x;
        }
        return false;
    }
}
