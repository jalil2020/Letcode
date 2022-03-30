package com.company.easy;

public class DefanginganIPAddress {
    public static void main(String[] args) {

        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.'){
                builder.append('[');
                builder.append('.');
                builder.append(']');
            }else {
                builder.append(address.charAt(i));
            }
        }


        return builder.toString();
    }
}
