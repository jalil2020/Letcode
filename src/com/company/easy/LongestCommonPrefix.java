package com.company.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flower","flower","flower"};
        String[] strs2 = new String[]{"flower","fkow"};
        String[] strs3 = new String[]{"a","b"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
        if (strs.length == 1) return strs[0];

        StringBuilder builder = new StringBuilder();
        boolean bor = false;
        String longest = "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (String str:strs){
                if (str.charAt(i) != strs[0].charAt(i)){
                    bor = true;
                    break;
                }
            }
            if (!bor){
                builder.append(strs[0].charAt(i));
                if (longest.length() < builder.length()){
                    longest = builder.toString();
                }
            }else {
                builder = new StringBuilder();
                bor = false;
                break;
            }
        }
        return longest;
    }
}
