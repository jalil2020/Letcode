package com.company.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }

    static int minimumSum(int num) {
        int sum = 0;
        int a, b;
        String s = String.valueOf(num);
        s = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        a = ((int) s.charAt(0) - 48) * 10;
        b = ((int) s.charAt(1) - 48) * 10;
        a = a + (int) s.charAt(2) - 48;
        b = b + (int) s.charAt(3) - 48;

        return a+b;
    }

}
