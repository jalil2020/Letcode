package com.company.easy;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {

        int[] test = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(test)));

    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];

        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x +=nums[i];
            sum[i] = x;
        }
        return sum;

    }
}
