public class no7 implements no7_1, no7_2 {
    @Override
    public void display() {
        System.out.println("1st inherited class");
    }

    @Override
    public void print() {
        System.out.println("2nd inherited class");
    }

    public static void main(String[] args) {
        no7 o = new no7();
        o.display();
        o.print();
    }
}

interface no7_1 {
    void display();
}

interface no7_2

{
    void print();
}