package com.company.easy;

import java.util.Arrays;

public class P58 {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello world"));
    }

    public static int lengthOfLastWord(String s) {
        String[] arrays = s.split(" ");
        String str = arrays[arrays.length - 1];
        return str.length();
    }
}
