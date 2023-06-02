package mvc;

public class main {
    public static void main(String[] args) {

        encap e = new encap();
        inter i = new impliment();

        e.setA(5);
        e.setB(6);

        System.out.println(i.add(e));
        System.out.println(i.sub(e));

    }
}
