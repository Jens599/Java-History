class FA {
    void disp() {
        System.out.println("Parent");
    }
}

class CA extends FA {
    void disp() {
        System.out.println("Child");
    }
}

public class no5 {
    public static void main(String[] args) {
        FA f1 = new FA();
        CA c1 = new CA();
        FA obj;
        obj = f1;
        obj.disp();
        c1.disp();
    }
}
