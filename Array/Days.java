package CS203Course.Array;

import java.util.Scanner;

public class Days {
    public static void day(){

        Scanner input = new Scanner(System.in);
        System.out.println("Write the number of days.");
        int days = input.nextInt();
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + seconds);
    }
    public static void main(String[] args) {
        day();
    }
}
