package com.company.easy;

public class ReverseString {
    public static void main(String[] args) {

        char[] a = {'h', 'e', 'l', 'l', 'o'};
        reverseString2(a);
    }
    public static void reverseString2(char[] s) {
        int len = s.length;

        if (len == 0)
            return;

        for (int i=0; i < (len/2); i++)
        {
            char l = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = l;
        }

        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        System.out.print("[");
        for (int i = s.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print((char) 34 + "" + s[i] + "" + (char) 34 + ",");
            else System.out.print((char) 34 + "" + s[i] + "" + (char) 34);

        }
        System.out.println("]");
    }
}
