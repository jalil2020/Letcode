package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};

        System.out.println(kidsWithCandies(candies, 3));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleans = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0; i <candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= max) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }
        }
        return booleans;

    }
}
