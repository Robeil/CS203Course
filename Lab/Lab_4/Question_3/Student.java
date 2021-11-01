package CS203Course.Lab.Lab_4.Question_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Student {


    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dayTime = LocalDateTime.now();
        DateTimeFormatter formated = DateTimeFormatter.ofPattern("E => MMM-dd-yyyy HH:mm:ss");
        String formattedDate = dayTime.format(formated);
        System.out.println("After formatting " + formattedDate);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dayTime);
    }
}
