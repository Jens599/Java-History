public class no4 extends no4_2 {

    void display() {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        no4 o = new no4();
        o.display();
    }
}

class no4_2 {
    void display() {
        System.out.println("parent class");
    }
}