package com.company.easy;

import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {

        int[] test = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(test, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;
    }
}
