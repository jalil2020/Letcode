package com.company.daily;

import com.company.Utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Intersection {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 2, 1};
        int[] n2 = {2, 2};

        Utils.showArray(intersection(n1, n2));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] ans = new int[1000];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && Utils.getArrayIndex(ans, nums2[j]) < 0) {
                    ans[k] = nums1[i];
                    k++;

                }
            }
        }

        int[] m = new int[k];

        for (int i = 0; i < k; i++) {
            m[i] = ans[i];
        }


        return m;
    }
}
