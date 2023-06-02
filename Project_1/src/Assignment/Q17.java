
//Override the Display name function from the child class also write the code to perform dynamic method dispatch.
package Assignment;


class OverrideParent{

    void display(){
        System.out.println("Override Parent");
    }

}class OverrideChild extends OverrideParent{

    void display(){
        System.out.println("Override Child");
    }

}


public class Q17 {

    public static void main(String[] args) {

        OverrideParent op = new OverrideParent();
        OverrideParent oc = new OverrideChild();

        oc.display();
        op.display();

    }

}
