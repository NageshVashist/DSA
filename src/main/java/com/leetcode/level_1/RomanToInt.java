package com.leetcode.level_1;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        HashMap<String,Integer> romans= new HashMap();
        romans.put("I",1);
        romans.put("V",5);
        romans.put("X",10);
        romans.put("L",50);
        romans.put("C",100);
        romans.put("D",500);
        romans.put("M",1000);

        String s = "MCMXCIV";
        String[] charArray = s.split("");
        int a = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray.length - 1 > i && romans.get(charArray[i]) < romans.get(charArray[i + 1])) {
                a -= romans.get(charArray[i]);
            } else {
                a += romans.get(charArray[i]);
            }

        }
        System.out.println(a);
    }

}
