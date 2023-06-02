package com.jens;

class parent {
    void display(){

        System.out.println("Parent");

    }

}

class child extends parent{

    void display(){

        System.out.println("Child");

    }

}

public class Method_Overriding{

    public static void main(String[] args) {

        child C = new child();
        C.display();

    }

}