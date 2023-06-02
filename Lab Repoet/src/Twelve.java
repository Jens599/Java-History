public class Twelve {
    public static void main(String[] args) {
        Encap e = new Encap();
        e.setNum1(10);
        e.setNum2(5);
        int sum = e.getNum1() + e.getNum2();
        int difference = e.getNum1() - e.getNum2();
        System.out.print("Sum:" + sum + "\nDifference: " + difference);
    }
}
class Encap{
    private int num1 , num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
