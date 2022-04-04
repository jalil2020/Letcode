package com.company.easy;

import javax.swing.plaf.IconUIResource;

public class ValidPalindromeII {
    public static void main(String[] args) {

        int[] a =new int[1000];

        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        int count = 0;
        boolean bool = false;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(s.length() - 1 - i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (builder.charAt(i) != s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        if (count <= 2 && s.length() % 2 == 0 || count <= 1) bool = true;

        return bool;
    }
}
