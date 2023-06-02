public class Eleven {
    public static void main(String[] args) {
        new Student();
        new Student("Jens");
    }
}

class Student{
    public Student() {
        System.out.println("Student: Unknown");
    }
    public Student(String name) {
        System.out.println("Student: " + name);
    }
}
