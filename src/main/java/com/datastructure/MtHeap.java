package com.datastructure;

import java.util.ArrayList;

public class MtHeap {

    static ArrayList<Integer> arr = new ArrayList<>();


    public static void main(String[] args) {
//        arr.add(Integer.MAX_VALUE);
        MtHeap h = new MtHeap();

        h.add(2);
        h.add(6);
        h.add(15);
        h.add(5);
        h.add(3);
        h.add(12);
        h.add(10);
        h.add(9);
        h.add(8);
        System.out.println();

    }

    public void add(int a) {
        arr.add(a);
        int cpos = arr.size()-1 ;
        if (cpos > 0) {
            while (arr.get(cpos) > arr.get(getParent(cpos))) {
                int p = getParent(cpos);
                int t = arr.get(p);
                arr.set(p, arr.get(cpos));
                arr.set(cpos, t);
                cpos = p;
            }
        }
    }

    public void remove() {

    }

    public int getParent(int pos) {
        int s=pos / 2;
        return s;
    }

    public int getLeft(int pos) {
        return pos * 2;
    }

    public int getRight(int pos) {
        return (pos * 2) + 1;
    }
}
