package com.company;

public class Utils {

   public static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int getArrayIndex(int[] arr,int value) {
        int k = -1;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == value){
                k = i;
                break;
            }
        }
        return k;
    }

}
