package com.company.easy;

import java.util.Arrays;

public class P1929 {
    public static void main(String[] args) {
        int[] example = new  int[]{1,2,1};
        System.out.println(Arrays.toString(getConcatenation(example)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[nums.length*2];

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[i%nums.length];
        }

        return nums2;
    }
}
