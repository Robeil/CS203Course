package CS203Course.Classes;

import java.util.Scanner;

public class Bill {
    public static double RATE = 150.00;
    private int hours;
    private int minutes;
    private double fee;

    public void inputTimeWorked() {
        System.out.println("Enter number of full hours worked");
        System.out.println("followed by the number 0f minutes");
        Scanner input = new Scanner(System.in);
        hours = input.nextInt();
        minutes = input.nextInt();
    }

    public double computeFee(int hoursWorked, int minuteWorked) {
        minuteWorked = hours * 60 + minuteWorked;
        int quarterHours = minuteWorked / 15;
        return quarterHours * RATE;
    }

    public void updateFee() {
        fee = computeFee(hours, minutes);
    }

    public void outPutBill() {
        System.out.println("Time worked: ");
        System.out.println(hours + "Hours and " + minutes + " minutes");
        System.out.println("Rate $ " + RATE + " Per quarter hour.");
        System.out.println("Amount due: $" + fee);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the law office");
        System.out.println("Dewey, Cheatham, and Howe.");
        Bill yourBill = new Bill();
        yourBill.inputTimeWorked();
        yourBill.updateFee();
        yourBill.outPutBill();
        System.out.println("We have placed a lien on your house.");
        System.out.println("it has been our pleasure to serve you.");
    }
}
