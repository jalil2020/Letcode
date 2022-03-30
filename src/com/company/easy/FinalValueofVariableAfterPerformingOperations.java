package com.company.easy;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {

        String[] test = {"--X","X++","X++"};

        System.out.println(finalValueAfterOperations(test));
    }
    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (int i = 0; i < operations.length; i++) {

            switch (operations[i]){
                case "++X": ++x; break;
                case "X++": x++; break;
                case "--X": --x; break;
                case "X--": x--; break;
            }
        }
        return x;

    }
}
