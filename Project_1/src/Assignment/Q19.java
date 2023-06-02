//Wap to create your own exception and throw the exception using throw and throes keywords.
package Assignment;

public class Q19 {

    private class ValueGreater extends Exception {
        public ValueGreater(String s) {
            super(s);
        }
    }

    void Exception(int a) throws ValueGreater{
        if (a>20)
            throw new ValueGreater("Entered value is greater than expected");
        System.out.println("Right Range");

    }

    public static void main(String[] args) {
        Q19 q = new Q19();
        try {
            q.Exception(50);
        } catch (ValueGreater e) {
            throw new RuntimeException(e);
        }
    }
}
