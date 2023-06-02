public class no8 {
    public static void main(String[] args) {
        no8_2 o = new no8_2();
        o.display();
    }

}
abstract class no8_1{
    void display(){
        System.out.println("abstract class");
    }
}
class no8_2 extends no8_1{
    void print(){
        System.out.println("other class");
    }
}
