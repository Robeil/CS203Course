package CS203Course.Classes_Part_II;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.Date;

public class Classes {
    private static int myStaticVariable = 0;
    public static final int BIRTH_YEAR = 1974;


    public static void calculateYear() {
        int currentYear = 2021;
        int year = currentYear - Classes.BIRTH_YEAR;
        System.out.println(year);
    

    }

    public static void main(String[] args) {
        calculateYear();
    }
}
