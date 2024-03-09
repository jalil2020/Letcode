package com.company;

public class GetCommon {
    public static void main(String[] args) {

        int[] num1 = {2, 4};
        int[] num2 = {1, 2};

        System.out.println(getCommon(num1, num2));

    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int ans = -1;

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j])
                return nums1[i];
            if (nums1[i] < nums2[j])
                ++i;
            else
                ++j;
        }

        return ans;
    }
}
