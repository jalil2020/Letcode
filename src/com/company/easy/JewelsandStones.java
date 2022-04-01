package com.company.easy;

public class JewelsandStones {
    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

            for (int i = 0; i < stones.length(); i++) {
                for (int j = 0; j < jewels.length(); j++) {
                    if (jewels.charAt(j) == stones.charAt(i)) count++;
                }
            }
            return count;

    }
}
