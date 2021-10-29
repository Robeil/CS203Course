package CS203Course.Lab.Lab_1.Question_11.myutil;

import CS203Course.Lab.Lab_1.Question_10.myutil.MealCard;
import CS203Course.Lab.Lab_1.Question_10.myutil.Student;

import java.util.Scanner;


public class MealCardTest {

    public static void main(String[] args) {

        //creating meal-card for a student
        MealCard card1 = new MealCard(500, new Student("Robeil"));

        //buying food here
        card1.buyFood(23, 500);

        //checking availability points in the meal-card
        System.out.println("You have " + card1.checkPoints(500) + " points remaining.");

        //buying extra points here
        System.out.println("You purchased " +card1.buyExtraPoint(60) + " extra points.");

        //printing the student name
        System.out.println("Student name is " + card1.getStudent().getName());


    }
}

