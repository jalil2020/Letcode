package com.company.misol;

import java.util.Arrays;

public class MinimumBoxes {
    public static void main(String[] args) {
        int[] a = {5, 5, 5};
        int[] b = {2, 4, 2, 7};
        System.out.println(minimumBoxes(a, b));
    }

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int summa = 0;
        for (int i = 0; i < apple.length; i++) {
            summa += apple[i];
        }

        Arrays.sort(capacity);
        int count = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            count++;
            summa -= capacity[i];

            if (summa <= 0) {
                break;
            }

        }

        return count;
    }
}
