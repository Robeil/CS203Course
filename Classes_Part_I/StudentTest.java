package CS203Course.Classes_Part_I;

public class StudentTest {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "patrick";
        s.id = 123456;
        printStudentInfo(s);
        printStudentInfo(new Student());
        printer("Robeil");
        printer(30);
        
    }

    static void printStudentInfo(Student myStudent) {
        System.out.println("Student name: " + myStudent.name + " Student Id: " + myStudent.id);
    }
    static void printer(String name){
        System.out.println(name);
    }
    static void printer(int age){
        System.out.println(age);
    }
}