package com.company.easy;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1211));
    }
    public static boolean isPalindrome(int x) {
        int y = 0;
        int memory = x;

        if (x<0) return false;

        while (x > 0){
            y = y*10 + x%10;
            x = x/10;
            System.out.println("y="+y);
        }

      return  y == memory;
    }
}
