package mvc;

public class impliment implements inter {
    @Override
    public int add(encap e) {
        return(e.getA() + e.getB());
    }

    @Override
    public int sub(encap e) {
        return e.getA()-e.getB();
    }
}
