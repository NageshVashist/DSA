package com.leetcode.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("acb","adfbsdfc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        if(s.length()>t.length()){
            return false;
        }
        String s1[] = s.split(""), t1[] = t.split("");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(t1));
        int seq=0;
        for(int i=0;i<t1.length;i++){
            if(seq<s.length()){
                if(s1[seq].equals(t1[i])){
                    seq++;
                }
            }
        }
        return seq==s.length();
    }
}
