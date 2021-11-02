package CS203Course.Lab.Lab_1_1.Question_17;

public class TestGraderTest {

    public static void main(String[] args) {

        TestGrader student1 = new TestGrader(9,9,9,99,99);

        //calling the object and printing the grade
        student1.calculateLetterGrade();

        student1.printGradeReport();

    }
}
