class no6_1 {
    static void display(String a) {
        System.out.println("Hello" + a);
        int b;
    }
}
public class no6 extends no6_1 {
    public no6(String a) {
        System.out.println("Super keyword used:");
        super.display(a);
    }
    public static void main(String[] args) {
        new no6("Jens");
    }
}