package com.company.medium;

import java.util.Arrays;
import java.util.Collections;

public class P3 {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("dvdaf"));
        System.out.println(lengthOfLongestSubstring("abca"));
        System.out.println(lengthOfLongestSubstring("pwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {
        int index = 0;
        int boshIndex = 0;
        int max = 0;
        boolean bor = false;
        char[] current = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < index; j++) {
                if (current[j] == s.charAt(i)) {
                    bor = true;
                    break;
                }
            }
            if (!bor) {
                current[index] = s.charAt(i);
                index++;
                if (index > max) {
                    max = index;
                }
            } else {
                int index2 =new String(current).indexOf(s.charAt(i));
                i = boshIndex + index2+1;
                System.out.println("index2="+i);
                current = new char[s.length()];
                boshIndex = i;
                bor = false;
                index = 0;
                current[index] = s.charAt(i);
                index++;
            }
        }
        return max;
    }
}
