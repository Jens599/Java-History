//Wap to support multiple inheritance in java.
package Assignment;

interface Interface_1{
    void print();
}

interface Interface_2{
    void display();
}
public class Q16 implements Interface_1 , Interface_2{

    public void print(){
        System.out.println("Print");
    }

    public void display(){
        System.out.println("Display");
    }

    public static void main(String args[]){
        Q16 obj = new Q16();
        obj.print();
        obj.display();

    }
}