package com.syntax.review6;

public class StrBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);

        String str = sb.toString();
        str.toLowerCase();
        System.out.println(str);

    }
}
