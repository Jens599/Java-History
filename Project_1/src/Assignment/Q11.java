
/*Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.*/
package Assignment;

class Student{

    void display(){ System.out.println("Student: Unknown"); }
    void display(String name){ System.out.println("Student: " + name); }

}

public class Q11 {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
        s.display("Jens");

    }

}
