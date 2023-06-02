
/*we have to calc area of rectangle, square and a circle. create an abstract class Shape with three abstract methods mainly rectangular area taking two parameters, square area and circle
area taking one parameter each the parameters of rectangular area are its length and breadth, that of square area is its side and circle area is its radius. Now create another class containing
all methods for printing the areas respectively. create an object of class area and call all methods.
 */
package com.jens;

abstract class sape {

    abstract void rectangleArea(int length,int breadth);

    abstract void squareArea(int side);

    abstract void circleArea(int radius);
}

class Area extends sape{

    final float Pi = 3.14F ;

    void rectangleArea(int length,int breadth){
        System.out.println("Area= " + (length * breadth));
    }

    void squareArea(int side){
        System.out.println("Area= " + (side ^ 2));
    }

    void circleArea(int radius){
        float area = Pi * (radius ^ 2);
        System.out.println("Area= " + area);
    }
}

public class Q1_Using_Abstract {



    public static void main(String[] args) {

        var area = new Area();
        area.rectangleArea(5,5);
        area.squareArea(5);
        area.circleArea(5);
    }

}
