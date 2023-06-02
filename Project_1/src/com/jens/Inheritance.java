/* Create a class named shape with a method to print "this is shape". Then create two other classes named rectangle and circle inheriting the shape class both having a method to print
this is rectangular shape and this is circular shape respectively. Create a subclass square of rectangle having a method to print square is a rectangle. Now call the method of shape and
rectangle class by the object of sqaure class.*/
package com.jens;

class shape{
    void displayShape(){

        System.out.println("this is Shape");
    }
}
class rectangle extends shape{
    void displayRectangle(){

        System.out.println("this is a rectangular shape");
    }
    static class square extends rectangle{
        void displaySquare(){
            System.out.println("Square is a Rectangle");
        }
    }
}
class circle extends shape{
    void displayCircle(){
        System.out.println("this is a circular shape");
    }
}


public class Inheritance extends rectangle {
    public static void main(String[] args) {

        square sq = new square();
        sq.displayShape();
        sq.displayRectangle();
    }
}