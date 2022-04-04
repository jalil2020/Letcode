package com.company.hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

        int[] ints = {7, 2, 5, 10, 8};

        splitArray(ints, 2);
    }

    public static int splitArray(int[] nums, int m) {
        int sum = 0;
        Arrays.sort(nums);
        int digsts = nums.length/m;


        return sum;

    }
}
