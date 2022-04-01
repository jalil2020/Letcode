package com.company.easy;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {

        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int multip = 1;

        while (n > 0) {
            multip *= n % 10;
            sum += n % 10;
            n /= 10;
        }

        return multip - sum;
    }
}

