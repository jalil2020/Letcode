package com.company.easy;

import java.util.*;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> n1 = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            n1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {

            if (n1.contains(nums2[i]) && !ans.contains(nums2[i])){
                ans.add(nums2[i]);
            }

        }
        int[] a = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            a[i] = ans.get(i);
        }

        return a;
    }
}
