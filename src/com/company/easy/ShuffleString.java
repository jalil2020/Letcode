package com.company.easy;

import java.util.*;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));


    }

    public static String restoreString(String s, int[] indices) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], String.valueOf(s.charAt(i)));
        }

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < map.size(); i++) {
            builder.append(map.get(i));
        }
        return builder.toString();
    }
}
