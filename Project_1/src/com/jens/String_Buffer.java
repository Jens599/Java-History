package com.jens;

public class String_Buffer {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
//        ---1.---


//        ---2.insert---
        buffer.insert(1,"java");
        System.out.println(buffer);

//        ---3.delete---
        buffer.delete(1,5);
        System.out.println(buffer);

//        ---4.reverse---
        buffer.reverse();
        System.out.println(buffer);

    }

}
