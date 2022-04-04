package com.company.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestTimeforGivenDigits {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        largestTimeFromDigits(test);
    }

    public static String largestTimeFromDigits(int[] arr) {
        List<String> b = new ArrayList<>(4);
        Arrays.sort(arr);
        int h1 = -1, h2 = -1, m1 = -1, m2 = -1;
        for (int i = 3; i >= 0; i--) {
            if (arr[i] > 5 || arr[i] <= 9) {
                m2 = arr[i];
            }


        }


        return b.get(0) + b.get(1) + b.get(2) + b.get(3);


    }
}
