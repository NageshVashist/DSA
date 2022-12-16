package com.leetcode.level_2;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome(new String[]{"lc", "cl", "gg"}));
        System.out.println(longestPalindrome(new String[]{"ab", "ty", "yt", "lc", "cl", "ab", "ww", "ww"}));
        System.out.println(longestPalindrome(new String[]{"cc", "ll", "xx"}));
        System.out.println(longestPalindrome(new String[]{"dd", "aa", "bb", "dd", "aa", "dd", "bb", "dd", "aa", "cc", "bb", "cc", "dd", "cc"}));
        System.out.println(longestPalindrome(new String[]{"qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"}));
    }

    public static int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int max=0;
        for (String word : words) {
            if (map.containsKey(new StringBuilder(word).reverse().toString())) {
                max+=4;
                map.put(new StringBuilder(word).reverse().toString(), map.get(new StringBuilder(word).reverse().toString()) - 1);
                if( map.get(new StringBuilder(word).reverse().toString())==0){
                    map.remove(new StringBuilder(word).reverse().toString());
                }
            } else {
                map.put(word, map.getOrDefault(word, 0)+1);
            }
        }

        for(int i=0;i<26;i++){
            char c= (char)('a'+i);
            if(map.getOrDefault(""+c+c,0)>0){
                max+=2;
                break;
            }
        }

        return max;
    }
}
