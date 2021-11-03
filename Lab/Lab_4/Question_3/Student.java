package CS203Course.Lab.Lab_4.Question_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Student implements Comparable<Student>{

    private String lastName;
    private int idNumber;


    public Student() {
        this.lastName = "MR.Interface";
        this.idNumber = 01;
    }

    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.idNumber - o.idNumber;
    }
}
