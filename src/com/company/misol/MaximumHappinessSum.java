package com.company.misol;

import java.util.Arrays;

public class MaximumHappinessSum {

    public static void main(String[] args) {
        int[] happiness = {2, 23,40, 99,0};
        int k = 3;
        System.out.println(maximumHappinessSum(happiness, k));
    }

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int count = 0;
        long summa = 0;
        for (int i = 0; i < k; i++) {

            if (happiness[happiness.length - 1 - count] - i > 0) {
                summa += happiness[happiness.length - 1 - count]-i;
                System.out.println(happiness[happiness.length - 1 - count]);
                count++;
            }
        }
        return summa;
    }
}
