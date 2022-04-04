package com.company.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberofOperationstoMoveAllBallstoEachBox {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(minOperations("001011")));
    }

    public static int[] minOperations(String boxes) {

        List<Integer> indexs = new ArrayList<>();
        int[] moveSums = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                indexs.add(i);
            }
        }

        for (int i = 0; i < boxes.length(); i++) {
            int sum = 0;
            for (int i1 = 0; i1 < indexs.size(); i1++) {
                sum += Math.abs(i - indexs.get(i1));
            }
            moveSums[i] =sum;
        }
        return  moveSums;

    }
}
