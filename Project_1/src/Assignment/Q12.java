
//Wap in java to add, subtract two numbers by using getter and setter function
package Assignment;

class Demo{

    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}

public class Q12 {

    public static void main(String[] args) {

        Demo objectDemo = new Demo();

        objectDemo.setNumber1(12);
        objectDemo.setNumber2(12);

        int add = objectDemo.getNumber1() + objectDemo.getNumber2();
        int subtract = objectDemo.getNumber1() - objectDemo.getNumber2();

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);

    }

}
