package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P242 {
    public static void main(String[] args) {
        System.out.print( isAnagram("Hello", "Hello"));
    }
    public static boolean isAnagram(String s, String t) {

        String[] arrays = s.split("");
        System.out.println(Arrays.stream(arrays).sorted());
        String str = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        String str2 = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());

        return str == str2;

    }
}
