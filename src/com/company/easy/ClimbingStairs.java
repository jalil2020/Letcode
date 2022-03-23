package com.company.easy;

public class ClimbingStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs2(5));

    }
    public static  int climbStairs2(int n){
        if (n==0) return 0;

        int staris[] = new int[n+1];
        staris[1] = 1;
        staris[2] = 2;

        for (int i = 3; i <= n; i++) {
            staris[i] = staris[i-1]+staris[i-2];
        }
        return staris[n];



    }

    public static int climbStairs(int n) {

        int sumOne = 0;
        int sumTwo = 0;
        int count = 0;
        while (sumOne <= n) {
            while (sumTwo <= n) {
                if (sumOne + sumTwo == n) {
                    count++;
                    if (sumOne != 0 && sumTwo !=0){
                        count++;
                    }
                    if (sumOne == sumTwo){
                        count++;
                    }
                    System.out.println("SumTwo "+sumTwo +"SumOne " + sumOne);
                }
                sumTwo += 2;
            }
            sumTwo = 0;
            sumOne += 1;
        }
        return count;
    }
}
