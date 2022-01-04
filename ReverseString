package com.philips.main;

public class ReverseString {

    public static void main(String[] args) {

        String s = "abba";

        if (s.equals(reverseS(s))) {
            System.out.println("palindrom hai");
        }

        if (s.equals(reverseStringBuilderSe(s))) {
            System.out.println("reverseStringBuilderSe");
        }
    }

    public static String reverseS(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;
    }

    public static String reverseStringBuilderSe(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            sb = sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
