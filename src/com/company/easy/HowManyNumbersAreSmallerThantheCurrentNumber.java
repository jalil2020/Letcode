package com.company.easy;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] test = {8, 1, 2, 2, 3};
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(test)));
    }


}

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ints = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                   count++;
                }
            }
            ints[i] = count;
        }

        return ints;
    }
}