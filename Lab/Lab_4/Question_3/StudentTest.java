package CS203Course.Lab.Lab_4.Question_3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student stu1 = new Student("Robeil",11);
        Student stu2 = new Student("Keleab",36);
        Student stu3 = new Student("Haben",22);
        Student stu4 = new Student("Merhawi",02);
        Student stu5 = new Student("Yonas",9);

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);


        Collections.sort(students);

        for(Student s: students){
            System.out.println("Name : " +s.getLastName() +", ID: "+s.getIdNumber());
        }

    }
}
