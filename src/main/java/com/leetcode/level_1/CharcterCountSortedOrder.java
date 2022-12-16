package com.leetcode.level_1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharcterCountSortedOrder {
    public static void main(String[] args) {
       String str = "geeksforgeeks";

        HashMap<Character,Integer> map = new HashMap<>();
        for (char a: str.toCharArray() ) {
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else {
                map.put(a,1);
            }
        }

        map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).forEach(System.out::println);

    }
}
