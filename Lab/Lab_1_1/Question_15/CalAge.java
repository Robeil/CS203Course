package CS203Course.Lab.Lab_1_1.Question_15;

import java.time.LocalDate;

public class CalAge {

    private int year;
    private int month;
    private int date;
    private double age;

    public boolean checkInputDate(int givenMonth, int givenDate) {

        boolean isValidDate = false;

        switch (givenMonth) {
            case 1:
                if (givenDate > 1 && givenDate <= 31) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 2:
                if (givenDate > 2 && givenDate <= 28) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 3:
                if (givenDate > 3 && givenDate <= 31) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 4:
                if (givenDate > 4 && givenDate <= 30) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 5:
                if (givenDate > 5 && givenDate <= 31) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 6:
                if (givenDate > 6 && givenDate <= 30) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 7:
                if (givenDate > 7 && givenDate <= 31) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 8:
                if (givenDate > 8 && givenDate <= 31) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 9:
                if (givenDate > 9 && givenDate <= 30) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 10:
                if (givenDate > 10 && givenDate <= 31) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 11:
                if (givenDate > 11 && givenDate <= 30) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            case 12:
                if (givenDate > 12 && givenDate <= 31) {
                    this.date = date;
                    isValidDate = true;
                } else {
                    System.out.println("Wrong date birth given");
                }
                break;
            default:
                System.out.println();
                break;
        }
        return isValidDate;
    }

    public String calAge(int year, int month) {

        LocalDate currentYear = LocalDate.now();

        int calYear;
        int calMonth = month;
        //checking if the given month is greater that the current month
        if (month > currentYear.getMonthValue()) {
            calYear = (currentYear.getYear() - 1) - year;

        } else {
            calYear = currentYear.getYear() - year;
            calMonth = currentYear.getMonthValue() - month;
        }

        return calYear + "." + calMonth + " Years Old.";
    }
}
