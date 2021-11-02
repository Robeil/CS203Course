package CS203Course.Lab.Lab_1_1.Question_17;


public class TestGrader {

    private double quiz1Grade;
    private double quiz2Grade;
    private double quiz3Grade;
    private double midTermGrade;
    private double finalGrade;
    private double overAllGrade;
    private char letterGrade;

    public TestGrader() {
    }

    public TestGrader(double quiz1Grade, double quiz2Grade, double quiz3Grade, double midTermGrade, double finalGrade) {

        this.quiz1Grade = quiz1Grade;
        this.quiz2Grade = quiz2Grade;
        this.quiz3Grade = quiz3Grade;
        this.midTermGrade = midTermGrade;
        this.finalGrade = finalGrade;
    }

    public double calculateOverallGrade() {

        //changing the percentage to decimal
        this.overAllGrade = (((this.quiz1Grade + this.quiz2Grade + this.quiz3Grade) * 100) / 30) / 4
                + (this.midTermGrade * 35) / 100
                + (this.finalGrade * 40) / 100;

       /*  return overAllGrade;
        quiz1Grade = quiz1Grade * (8.33 ) / 100;
        quiz2Grade = quiz2Grade * (8.33 ) / 100;
        quiz3Grade = quiz3Grade * (8.33 ) / 100;
        midTermGrade = midTermGrade * 35 / 100;
        finalGrade = finalGrade * 40 / 100;*/

        return this.overAllGrade;
    }

    public double getQuiz1Grade() {
        return quiz1Grade;
    }

    public void setQuiz1Grade(double quiz1Grade) {
        this.quiz1Grade = quiz1Grade;
    }

    public double getQuiz2Grade() {
        return quiz2Grade;
    }

    public void setQuiz2Grade(double quiz2Grade) {
        this.quiz2Grade = quiz2Grade;
    }

    public double getQuiz3Grade() {
        return quiz3Grade;
    }

    public void setQuiz3Grade(double quiz3Grade) {
        this.quiz3Grade = quiz3Grade;
    }

    public double getMidTermGrade() {
        return midTermGrade;
    }

    public void setMidTermGrade(double midTermGrade) {
        this.midTermGrade = midTermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getOverAllGrade() {
        return overAllGrade;
    }

    public void setOverAllGrade(double overAllGrade) {
        this.overAllGrade = overAllGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public void calculateLetterGrade() {

        //adding the calculated points to get the final grade
        //  double temp = quiz1Grade + quiz2Grade + quiz3Grade + midTermGrade + finalGrade;
        double temp = calculateOverallGrade();

        if ((this.quiz1Grade > 0 && this.quiz1Grade < 10) && (this.quiz2Grade > 0 && this.quiz2Grade < 10) && (this.quiz3Grade > 0 && this.quiz3Grade < 10) &&
                (this.midTermGrade > 0 && this.midTermGrade < 100) && (this.finalGrade > 0 && this.finalGrade < 100)) {

            //Giving the grade according the total points
            if (temp >= 90) {
                this.letterGrade = 'A';
            } else if (temp >= 80 && temp < 90) {
                this.letterGrade = 'B';
            } else if (temp >= 70 && temp < 80) {
                this.letterGrade = 'C';
            } else if (temp >= 60 && temp < 70) {
                this.letterGrade = 'D';
            } else {
                this.letterGrade = 'F';
            }
        } else {

        }

    }

    public void printGradeReport() {

        System.out.println(("\nQuize 1: " + this.quiz1Grade +

                "\nQuize 2: " + this.quiz2Grade
                + "\nQuize 3: " + this.quiz3Grade
                + "\nMid-Term: " + this.midTermGrade
                + "\nFinal grade: " + this.finalGrade
                + "\nGrade letter: " + getLetterGrade()
                + "\nTotal points: " + getOverAllGrade())

        );

    }
}