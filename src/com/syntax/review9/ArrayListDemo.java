package com.syntax.review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(12);
        alist.add(13);
        alist.add(14);

        int size = alist.size();
        System.out.println("The size of alist is " + size);

    }
}
