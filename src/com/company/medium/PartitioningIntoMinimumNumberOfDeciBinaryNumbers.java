package com.company.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {

        System.out.println(minPartitions("27346209830709182346"));
    }

    public static int minPartitions(String n) {

        n = Arrays.stream(n.split("")).sorted().collect(Collectors.joining());
        return n.charAt(n.length()-1)-48;
    }
}
