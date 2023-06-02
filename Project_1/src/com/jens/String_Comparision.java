package com.jens;

public class String_Comparision{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hEllo";

//        campairs case of letters
        System.out.println(s1.equals(s2));

//        ignores case
        System.out.println(s1.equalsIgnoreCase(s2));

     }
}
