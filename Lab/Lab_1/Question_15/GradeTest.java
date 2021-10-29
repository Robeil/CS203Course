package CS203Course.Lab.Lab_1.Question_15;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {

        Grade student1 = new Grade();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter result for first quizzes out of 10 points.");
        int firstQuizzes = input.nextInt();

        System.out.println("Enter result for second quizzes out of 10 points.");
        int secondQuizzes = input.nextInt();

        System.out.println("Enter result for third quizzes out of 10 points.");
        int thirdQuizzes = input.nextInt();

        System.out.println("Enter result for mid-term exam out of 100 points.");
        int midTerm = input.nextInt();

        System.out.println("Enter result for final exam out of 100 points.");
        int finalExam = input.nextInt();

        //calling the object and printing the grade
        char stu1 = student1.calculateGrade(firstQuizzes, secondQuizzes, thirdQuizzes, midTerm, finalExam);
        System.out.println(stu1);
    }
}
