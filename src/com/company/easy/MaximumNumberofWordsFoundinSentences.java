package com.company.easy;

public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String[] test = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(test));

    }

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            int size = sentence.split(" ").length;
            if (maxWords < size) maxWords = size;
        }
        return maxWords;

    }
}
