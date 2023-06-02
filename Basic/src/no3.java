public class no3 {
    public no3() {
        System.out.println("non parameter constructor");
    }
    no3(int a){
        System.out.println("parameterized constructor");
    }

    public static void main(String[] args) {
        new no3();
        new no3(3);
    }
}
