package com.practice;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList l = new CopyOnWriteArrayList();
        System.out.println(l);

        ArrayList al = new ArrayList();
        System.out.println(al);
    }
}
