package com.leetcode.level_2;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(s));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String l = strs[strs.length-1];
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=l.charAt(i)){
                break;
            }
            res+=s.charAt(i);
        }
        return res;
    }
}
