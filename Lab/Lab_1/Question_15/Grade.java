package CS203Course.Lab.Lab_1.Question_15;

public class Grade {

    private double firstQuizzes;
    private double secondQuizzes;
    private double thirdQuizzes;
    private double midTermExam;
    private double finalExam;

    public Grade() {
    }

    public char calculateGrade(int first, int second, int third, int midTerm, int finalExam) {

        //changing the percentage to decimal
        double firstD = first * (8.33 * 10) / 100;
        double secondD = second * (8.33 * 10) / 100;
        double thirdD = third * (8.33 * 10) / 100;
        double midTermD = midTerm * 35 / 100;
        double finalD = finalExam * 40 / 100;

        //adding the calculated points to get the final grade
        double totalScore = firstD + secondD + thirdD + midTermD + finalD;

        //Giving the grade according the total points
        if (totalScore >= 90) {
            return 'A';
        } else if (totalScore >= 80 && totalScore < 90) {
            return 'B';
        } else if (totalScore >= 70 && totalScore < 80) {
            return 'C';
        } else if (totalScore >= 60 && totalScore < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
