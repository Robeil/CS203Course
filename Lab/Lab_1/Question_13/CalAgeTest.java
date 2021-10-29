package CS203Course.Lab.Lab_1.Question_13;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class CalAgeTest {

    public static void main(String[] args) {

        LocalDate currentYear = LocalDate.now();

        //Getting the user year input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Date of birth, start with the year you were born..");
        int year = input.nextInt();
        System.out.println("then enter the month please.");
        int month = input.nextInt();
        System.out.println("and now enter the date please");
        int date = input.nextInt();

        //validate the given year entry and month
        if ((year <= currentYear.getYear()) && (month >= 0 && month <= 12)) {

            //creating object
            CalAge person1 = new CalAge();

            //this method will validate the given date
            if (person1.checkInputDate(month, date)) {
                System.out.println(person1.calAge(year, month));
            }

        } else {
            System.out.println("Wrong entry, enter a valid Date of birth.");
        }

    }

}
