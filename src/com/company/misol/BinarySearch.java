package com.company.misol;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = {9, 9, 8, 6, 5, 3, 1};
        int l = 0;
        int r = 6;
        int middle;
        while (l < r) {
            middle = (l + r) / 2;
            if (ints[middle] == n){
                l = middle;
                break;
            }else if (ints[middle] > n){
                l = middle +1;
            }else {
                r =middle;
            }
        }
        if (ints[l] == n){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
