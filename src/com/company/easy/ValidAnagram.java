package com.company.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        String a = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        String b = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
        return a.equals(b);
    }
}
