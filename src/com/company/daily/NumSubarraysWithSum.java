package com.company.daily;

public class NumSubarraysWithSum {
    public static void main(String[] args) {

        int[] test = {1, 0, 1, 0, 1};

        numSubarraysWithSum(test, 2);

    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int one = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one++;
            }
        }
        if (goal == 0) {
            return nums.length - one;
        } else {
            ans = (one - goal + 1) * goal;
        }
        return ans;
    }
}
