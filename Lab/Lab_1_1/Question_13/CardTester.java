package CS203Course.Lab.Lab_1_1.Question_13;


import CS203Course.Lab.Lab_1_1.Question_12.MealCard;

public class CardTester {
    public static void main(String[] args) {

        //creating meal-card for a student
        MealCard card1 = new MealCard(500);
        //buying food here
        card1.makePurchase(23);

        //buying extra points here
        card1.buyPoint(60);




    }
}
