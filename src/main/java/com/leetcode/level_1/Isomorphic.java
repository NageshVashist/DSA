package com.leetcode.level_1;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s1[] = "title".split("");
        String t1[] = "paper".split("");

        if (s1.length != t1.length) {
            System.out.println(false);
        }
        HashMap<String, String> m = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            if (m.containsKey(s1[i]) && !m.get(s1[i]).equals(t1[i])) {
                System.out.println(false);
                return;
            } else if (!m.containsKey(s1[i]) && m.containsValue(t1[i])) {
                System.out.println(false);
                return;
            } else {
                m.put(s1[i], t1[i]);
            }
        }
        System.out.println(true);
    }
}
