public class Ten {

    public Ten() {
        System.out.println("Constructor One");
    }
    public Ten(int a) {
        System.out.println("Constructor Two");
    }


    public static void main(String[] args) {
        new Ten();
        new Ten(5);
    }
}
